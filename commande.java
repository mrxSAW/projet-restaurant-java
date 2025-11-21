import java.util.*;

public class Commande {

    private int id;
    private Serveur serveur;
    private ArrayList<Plat> listePlat;

    public Commande(int id, Serveur serveur, ArrayList<Plat> listePlat) {
        this.id = id;
        this.serveur = serveur;

        if (listePlat != null) {
            this.listePlat = listePlat;
        } else {
            this.listePlat = new ArrayList<>();
        }
    }

    public int getId() {
        return id;
    }

    public  String getServeur() {
        return serveur;
    }

    public ArrayList<Plat> getListePlat() {
        return listePlat;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setListePlat(ArrayList<Plat> listePlat) {
        this.listePlat = listePlat;
    }

    public void setServeur(Serveur serveur) {
        this.serveur = serveur;
    }



    public double calculerTotalCommande() {
        double total = 0;

        for (Plat plat : listePlat) {
            total += plat.getPrice();
        }

        System.out.println("Le total de votre commande : " + total + " MAD");
        return total;
    }



    public void afficherDetailsCommande() {
        System.out.println("ID Commande : " + id);
        System.out.println("Serveur : " + serveur.getNom());
        System.out.println("===== Détails de la commande =====");

        for (Plat plat : listePlat) {
            System.out.println("Plat : " + plat.getNom());
            System.out.println("Prix : " + plat.getPrice() + " MAD");
            System.out.println("----------------------------------");
        }
    }



    public void assignerServeur(Serveur s) {
        this.serveur = s;
    }



    public void ajouterPlat(Plat plat) {
        this.listePlat.add(plat);
    }
}
