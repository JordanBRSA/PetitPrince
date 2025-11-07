package Jeu.JeuPFC;

public enum PFC {
    Pierre("Pierre"),
    Feuille("Feuille"),
    Ciseau("Ciseau");

    private String choix;

    private PFC(String choix) {
        this.choix = choix;
    }

}
