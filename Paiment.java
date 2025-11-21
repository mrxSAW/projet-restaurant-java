import java.util.Scanner;

public class Paiment {
    private int id;
    private double tolalprice;

    public Paiment(int id, double tolalprice) {
        this.id = id;
        this.tolalprice = tolalprice;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getTotalPrice() {
        return tolalprice;
    }
    public void setTotalPrice(double tolalprice) {
        this.tolalprice = tolalprice;
    }
public void Valider_paiment(){
    double paiment = 0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("enter vouter paiment.  ");
             paiment =  sc.nextDouble();
        }while (paiment <= 0);

       if(tolalprice < paiment){
           System.out.println("reminder is " + (paiment - tolalprice));
       }
       else if (tolalprice > paiment){
           System.out.println("you need to add " +  (tolalprice - paiment));
       }
}

}
