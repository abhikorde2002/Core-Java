package Loops.Digites;

import java.util.Scanner;

public class Digites_sumOFPrime {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
       System.out.println("Enter the Limites:- ");
        int upper=scanner.nextInt();
        int sum=1;
       int sumD = 0;
      
        for (int i = 2;i <= upper; i++){
          if (isPrime (i)){
           int prime = i;
           while(prime > 9){
               prime = digitSum(prime);
           }
           sum += prime;
       }
       
       }
   System.out.println(sum);
       
      }
   
       static int digitSum(int num){
           int sum = 0;
           while(num != 0){
                int dig =num %10;
                    sum=sum+dig;
                   num=num /10;
           }
           return sum;
       }
          static boolean isPrime (int n){
                int count = 0;
                if (n < 2) return false;
           for (int i = 2; i < n; i++){
                    if (n % i == 0) return false;
                  }
                return true;
          }
}
