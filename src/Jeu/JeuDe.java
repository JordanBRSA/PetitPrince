package Jeu;
import java.util.Random;
public class JeuDe extends JeuSimple{


    public JeuDe(String nom)
    {
        this.nom=nom;
    }


    @Override
    public int arbitrer(String c1, String c2) {

        int res = 0;    // Cas de base, égalité
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
        int tirage = new  Random().nextInt(1,6);
        return String.valueOf(tirage);  //Cast
    }
}
