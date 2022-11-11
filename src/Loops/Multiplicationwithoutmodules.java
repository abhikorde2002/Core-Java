import java.util.Scanner;

public class Multiplicationwithoutmodules {
    public static void main(String[]args){
    Scanner s1=new Scanner(System.in);
    System.out.println("Enter the number1 : ");
    int number1=s1.nextInt();
    System.out.println("Enter the number2 : ");
    int number2=s1.nextInt();
    int sum=0;
        for (int i = 1; i <=number2; i++) {

        sum = sum + number1;
        }

    System.out.println(sum);
    }
}
