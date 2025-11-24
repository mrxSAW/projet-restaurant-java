import java.util.ArrayList;
import java.util.Scanner;

public class GestionCommande {

    public static Serveur choisirServeur(ArrayList<Serveur> serveurs) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Choisissez un serveur ===");

        for (Serveur s : serveurs) {
            System.out.println(s.getId() + " - " + s.getNom());
        }

        int choix;

        do {
            System.out.print("Votre choix : ");
            choix = sc.nextInt();
        } while (choix < 1 || choix > serveurs.size());

        return serveurs.get(choix - 1);
    }


    public static Commande creerCommande(int id, Serveur serveur) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Plat> listePlat = new ArrayList<>();
        Plat p = new Plat();

        System.out.println("=== Création de la commande ===");


        p.afficherPlats();

        int choix;

        do {
            System.out.print("Choisissez un plat (0 pour terminer) : ");
            choix = sc.nextInt();

            if (choix > 0 && choix <= p.platsSenegalais.length) {

                String ligne = p.platsSenegalais[choix - 1];
                String[] parts = ligne.split(" - ");
                String nom = parts[0];
                double prix = Double.parseDouble(parts[1].replace(" MAD", ""));

                listePlat.add(new Plat(nom, prix));
                System.out.println(" Plat ajouté !");
            }

            else if(choix ==0) {
                                System.out.println("    Merci votre commande est cree");
                                 }
            else
                {System.out.println("choix invalid entrer un choix entre "+1+" et " + (p.platsSenegalais.length));}

        } while (choix != 0);


        Commande cmd = new Commande(id, serveur, listePlat);
        System.out.println("=== Commande créée avec succès ! ===");
        return cmd;
    }
}
