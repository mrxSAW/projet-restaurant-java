import java.util.*;

public class Client extends Personne {

    private int numeroTable;
    private ArrayList<Commande> commandesList = new ArrayList<>();

    public Client(int id, String nom, String gendre, String adresse, int numeroTable) {
        super(id, nom, gendre, adresse);
        this.numeroTable = numeroTable;
    }

    public void ajouterCommande(Commande c) {
        commandesList.add(c);
    }

    public void afficherCommande() {
        for (Commande c : commandesList) {
            c.afficherDetailsCommande();
        }
    }
}
