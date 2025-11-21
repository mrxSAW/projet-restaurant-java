import java.util.ArrayList;

public class Serveur extends Personne {

    private  List<Commendes> commendesList=new ArrayList<>();

    public Serveur(int id, String nom, String gendre, String adresse) {
        super(id, nom, gendre, adresse);

    }
    public void afficherLesCommandesLivrés() {
        for(Commendes c:commendesList){
            System.out.println(c);
    }
}
}
