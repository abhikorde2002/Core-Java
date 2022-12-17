import java.util.Scanner;

public class Powerof2number {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter the Base :- ");
        // int base=scanner.nextInt();
        // System.out.println("Enter the power :-");
        // int power=scanner.nextInt();
        // System.out.println(power(power, base));
        System.out.println((int) Math.pow(5, 2));
    }

    static int power(int power, int base) {
        int product = 1;

        for (int i = 1; i <= power; i++) {
            product = product * base;

        }
        System.out.println(base + " raise to  " + power + " is " + product);
        return product;

    }
}
