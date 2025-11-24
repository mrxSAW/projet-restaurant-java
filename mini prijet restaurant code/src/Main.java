import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Plat plat = new Plat();

        ArrayList<Commande> commandes = new ArrayList<>();

        ArrayList<Serveur> serveurs = new ArrayList<>();
        serveurs.add(new Serveur(1, "Mohamed", "Homme", "Dakar"));
        serveurs.add(new Serveur(2, "Fadel", "Homme", "Thies"));
        serveurs.add(new Serveur(3, "Youssef", "Homme", "Saint-Louis"));

        int choix;

        do {
            System.out.println("\nEntrer : ");
            System.out.println("1 - Afficher le menu");
            System.out.println("2 - Créer une commande");
            System.out.println("3 - Afficher vos commandes");
            System.out.println("4 - Afficher le serveur assigné à chaque commande");
            System.out.println("9 - Quitter");
            System.out.print("Choix : ");

            choix = sc.nextInt();

            switch (choix) {

                case 1:
                    System.out.println("===== MENU SÉNÉGALAIS =====");
                    plat.afficherPlats();
                    break;

                case 2:
                    
                    Serveur servChoisi = GestionCommande.choisirServeur(serveurs);
                    Commande c = GestionCommande.creerCommande(commandes.size() + 1, servChoisi);
                    commandes.add(c);
                    break;

                case 3:
                    if (commandes.isEmpty()) {
                        System.out.println("Aucune commande enregistrée.");
                    } else {
                        for (Commande cmd : commandes) {
                            cmd.afficherDetailsCommande();
                        }
                    }
                    break;

                case 4:
                    if (commandes.isEmpty()) {
                        System.out.println("Aucune commande disponible.");
                    } else {
                        for (Commande cmd : commandes) {
                            System.out.println("Commande ID : " + cmd.getId() +
                                    " | Serveur : " + cmd.getServeur().getNom());
                        }
                    }
                    break;

                case 9:
                    System.out.println("Merci et à bientôt !");
                    break;

                default:
                    System.out.println("Erreur : choix invalide !");
            }

        } while (choix != 9);
    }
}
