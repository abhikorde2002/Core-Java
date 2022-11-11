package Abhi;

import java.util.Scanner;

public class Reverce {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num=scanner.nextInt();
        rev(num);
    }

    static int rev(int num){
        int original=num;
        int reverse=0;
        while (num>0){
            int dig=num%10;
            reverse=reverse*10+dig;
            num=num/10;
        }
        System.out.println(" Reverse number of "+ num +" is "+ reverse);
        return reverse;

    }
}
