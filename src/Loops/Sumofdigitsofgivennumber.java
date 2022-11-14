import java.util.Scanner;

public class Sumofdigitsofgivennumber {
    public static void main(String[] args) {
        dig(100);
 
     }
 
     static int dig(int num){
         int sum=0;
         while (num>0){
             int dig=num%10;
             sum=sum+dig;
             num=num/10;
         }
         System.out.println("Sum of digits"+num+" is "+sum);
         return sum;
     }
        }
