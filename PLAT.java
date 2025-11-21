public class PLAT {
    private String nam;
    private double price;

   public  String platsSenegalais[] = {
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
    public PLAT(String nam, double price) {
        this.nam = nam;
        this.price = price;
    }
    public PLAT(){

    }
    public String getNam() {
        return nam;
    }
    public void setNam(String nam) {
        this.nam = nam;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "Plat{" + "nam=" + nam + ", price=" + price + '}';
    }
    public void affichage_des_plats(){
        for (String plat : platsSenegalais) {
            System.out.println(plat);
        }
    }

    public short length() {
        return (short)platsSenegalais.length;
    }
}
