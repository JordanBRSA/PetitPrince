package Jeu;

public abstract class JeuSimple {

    // Attribut
    protected String nom;

    //Méthodes
    public abstract int arbitrer(String c1 , String c2);

    public abstract String jouerUnTour();

    public String getNom() {return nom;}
}
