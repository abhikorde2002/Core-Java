package Kunal;

import java.util.Scanner;

public class Amstron {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        boolean ans=isArmstrong(n);
        System.out.println(ans);

//        for (int i=100;i<1000;i++){
//            if (isArmstrong(i)){
//                System.out.println(i);
//            }
//        }
    }

    static boolean isArmstrong(int n){
        int orignal= n;
        int sum=0;

        while (n > 0){
            int digits=n % 10;
            sum= sum+digits*digits*digits;
            n = n/10;
        }
        if (orignal==sum){
            return true;
        }
        return false;
    }

}
