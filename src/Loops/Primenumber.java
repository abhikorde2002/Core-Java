import java.util.Scanner;

public class Primenumber {
   public static void main(String[]args){
       System.out.println("Enter the number");
       Scanner sc = new Scanner(System.in);
       int number=sc.nextInt();
       System.out.println(isPrime(number));;
    //    boolean flag=true;
    //    for(int i=2;i<number;i++) {
    //        if (number % i == 0) {

    //            flag = false;

    //        }
    //    }
    //        System.out.println((flag)?"Prime number":"Not Prime Number");

   }
   static boolean isPrime(int n){
    if (n<=1){
        return false;
    }
    for (int i=2;i<=Math.sqrt(n);i++){
        if (n%i==0){
            return false;
        }
    }
    return true;
}
}
