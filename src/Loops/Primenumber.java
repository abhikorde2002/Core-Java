import java.util.Scanner;

public class Primenumber {
   public static void main(String[]args){
       System.out.println("Enter the number");
       Scanner sc = new Scanner(System.in);
       int number=sc.nextInt();
       boolean flag=true;
       for(int i=2;i<number;i++) {
           if (number % i == 0) {

               flag = false;

           }
       }
           System.out.println((flag)?"Prime number":"Not Prime Number");

   }
}
