import java.util.Scanner;

public class Nnumber2 {
    public static void main(String[]args){
        int number1,number2;
        int sum=0;
        System.out.println("Enter the number");
        Scanner s1=new Scanner(System.in);
        number1=s1.nextInt();
        number2=s1.nextInt();
        for(int i=number1;i<=number2;i++){
            sum=sum+i;
            System.out.println((i+" "+sum));
        }
        System.out.println("Sum of n number is"+sum);
    }
}
