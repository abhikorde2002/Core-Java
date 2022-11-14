import java.util.Scanner;

public class Bil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount :- ");
        int amount=scanner.nextInt();

        int original=amount;
        if ((amount>100)||(amount<1000)){
            int Dis=original*10/100;

            System.out.println("Discount on product is :- "+Dis);

        }
        else if ((amount>1000)||(amount<2500)){
            int Dis=original*20/100;
            System.out.println("Discount on product is :- "+Dis);
        }
        else if ((amount>2500)||(amount<1000)){
            int Dis=original*30/100;
            System.out.println("Discount on product is :- "+Dis);
        }
    }
}
