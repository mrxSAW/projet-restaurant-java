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

    public int getId() { return id; }
    public String getNom() { return nom; }
    public String getGendre() { return gendre; }
    public String getAdresse() { return adresse; }

    public void setId(int id) { this.id = id; }
    public void setNom(String nom) { this.nom = nom; }
    public void setGendre(String gendre) { this.gendre = gendre; }
    public void setAdresse(String adresse) { this.adresse = adresse; }
}
