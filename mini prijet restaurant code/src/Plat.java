public class Plat {

    public String[] platsSenegalais = {
            "Thiéboudienne - 120 MAD",
            "Yassa Poulet - 100 MAD",
            "Mafé - 110 MAD",
            "Domoda - 105 MAD",
            "Caldou - 115 MAD",
            "Soupou Kandja - 120 MAD",
            "Lakh - 70 MAD",
            "Thiakry - 50 MAD",
            "Pastels - 40 MAD",
            "Ngalakh - 90 MAD"
    };

    private String nom;
    private double price;

    public Plat() {}

    public Plat(String nom, double price) {
        this.nom = nom;
        this.price = price;
    }

    public String getNom() { return nom; }
    public double getPrice() { return price; }

    public void afficherPlats() {
        int i = 1;
        for (String p : platsSenegalais) {
            System.out.println(i + " - " + p);
            i++;
        }
    }
}
