import java.util.Scanner;

public class Factorial {
    public static void main(String[]args){
        int number;
        int fact=1;
        System.out.println("Enter The Number");
        Scanner s1=new Scanner(System.in);
        number=s1.nextInt();
        for(int i=1;i<=number;i++){
            fact=fact*i;
            System.out.println(i+" "+fact);
        }
        System.out.println("factorial of"+number+"is"+fact);
    }
}
