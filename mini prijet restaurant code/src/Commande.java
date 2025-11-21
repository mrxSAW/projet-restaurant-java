import java.util.*;

public class Commande {

    private int id;
    private Serveur serveur;
    private ArrayList<Plat> listePlat;

    public Commande(int id, Serveur serveur, ArrayList<Plat> listePlat) {
        this.id = id;
        this.serveur = serveur;
        this.listePlat = (listePlat != null) ? listePlat : new ArrayList<>();
    }

    public int getId() { return id; }

    public double calculerTotalCommande() {
        double total = 0;
        for (Plat p : listePlat) total += p.getPrice();
        return total;
    }

    public void afficherDetailsCommande() {
        System.out.println("\n===== COMMANDE N°" + id + " =====");
        System.out.println("Serveur : " + serveur.getNom());

        for (Plat p : listePlat) {
            System.out.println(p.getNom() + " - " + p.getPrice() + " MAD");
        }

        System.out.println("TOTAL : " + calculerTotalCommande() + " MAD");
    }

    public void ajouterPlat(Plat plat) {
        listePlat.add(plat);
    }
    public Serveur getServeur() {
        return serveur;
    }
}
