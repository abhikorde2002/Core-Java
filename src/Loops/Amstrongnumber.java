 import java.util.Scanner;
 public class Amstrongnumber {
     public static void main(String[] args) {
        int number;
         System.out.println("Enter the number");
         Scanner s1=new Scanner(System.in);
         number=s1.nextInt();
         int original=number;
         int Sumofdigits=0;
         while(number>0){
             int digits=number%10;
             Sumofdigits+=digits*digits*digits;
             number=number/10;

         }
         System.out.println((original==Sumofdigits)?"Amstrong number":"Not Amstrong number");
     }
 }

