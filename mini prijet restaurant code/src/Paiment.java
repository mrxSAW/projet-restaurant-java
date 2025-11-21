import java.util.Scanner;

public class Paiment {

    private int id;
    private double totalPrice;

    public Paiment(int id, double totalPrice) {
        this.id = id;
        this.totalPrice = totalPrice;
    }

    public void validerPaiement() {
        Scanner sc = new Scanner(System.in);
        double paiement;

        do {
            System.out.print("Entrez votre paiement: ");
            paiement = sc.nextDouble();
        } while (paiement <= 0);

        if (paiement > totalPrice)
            System.out.println("Reste : " + (paiement - totalPrice));
        else if (paiement < totalPrice)
            System.out.println("Il manque : " + (totalPrice - paiement));
        else
            System.out.println("Paiement exact, merci !");
    }
}
