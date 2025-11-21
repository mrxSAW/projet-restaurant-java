import java.util.ArrayList;
import java.util.Scanner;

public class Client extends Personne {

    private int NuméroTable;
    private  List<Commendes> commendesList= new List<Commendes>();

    public Client(int id, String nom, String gendre, String adresse, int numéroTable) {
        super(id, nom, gendre, adresse);
        NuméroTable = numéroTable;
    }

    public void setNuméroTable(int numéroTable) {
        NuméroTable = numéroTable;
    }

public void afficherCommande() {



}
public void ajouterunecommande(Commendes c){
        commendesList.add(c);
}

}
