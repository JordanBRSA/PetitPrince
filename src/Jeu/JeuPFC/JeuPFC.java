package Jeu.JeuPFC;

import Jeu.JeuSimple;

public class JeuPFC extends JeuSimple {

    public JeuPFC(String nom){
        this.nom = nom;
    }


    @Override
    public int arbitrer(String c1, String c2) {

        int res = 0;
        if (Integer.parseInt(c1) > Integer.parseInt(c2)) {
            res = -1;   //C1 Gagne
        }
        if (Integer.parseInt(c1) < Integer.parseInt(c2)) {
            res = 1;    //C2 Gagne
        }
        return res;
    }
    @Override
    public String jouerUnTour() {
        return "";
    }
}
