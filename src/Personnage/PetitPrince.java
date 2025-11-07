package Personnage;

import asteroide.Sujet;
import asteroide.console.ConsoleJavaBoy;

public class PetitPrince implements Sujet {

    private String nom;
    private int argent;
    private int cpt;
    private ConsoleJavaBoy console;

    public PetitPrince(int argent) {
        this.nom = "Le Méchant";
        this.argent = argent;
        this.cpt = 0;
        this.console = new ConsoleJavaBoy(this);
    }

    @Override
    public String getNom() {
        return nom;
    }
    @Override
    public int getArgent() {
        return argent;
    }

    @Override
    public void run(){
        console.parler("Je suis un petit prince !");
        console.seDirigerVers(0);
        cpt ++;
        console.parler("Tour n° "+ cpt +".");
    }
}
