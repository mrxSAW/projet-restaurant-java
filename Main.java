
public class Main {
    PLAT plat = new PLAT();
    public void Menu() {
        System.out.println("Welcome to the Plats Senegalais");
        for (short i = 1; i <= plat.length(); i++) {
            System.out.println(i + " _ " + plat.platsSenegalais[i]);
        }
    }
    public static void main(String[] args) {
PLAT plat = new PLAT();
plat.affichage_des_plats();
    Main m = new Main();
    m.Menu();
    }
}