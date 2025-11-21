public class Personne {

    private int id;
    private String nom;
    private String gendre;
    private String adresse;

    public Personne(int id, String nom, String gendre, String adresse) {
        this.id = id;
        this.nom = nom;
        this.gendre = gendre;
        this.adresse = adresse;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getGendre() {
        return gendre;
    }

    public void setGendre(String gendre) {
        this.gendre = gendre;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }


}
