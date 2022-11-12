package Abhi;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        boolean ans = isPrime(n);
        System.out.println(ans);
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
//     static boolean isPrime(int n){
//        if (n<=1){
//            return false;
//        }
//        int c=2;
//        while (c*c<=n){
//            if (n%c==0){
//                return false;
//            }
//            c++;
//        }
//        return c * c>n;
 //    }
}
