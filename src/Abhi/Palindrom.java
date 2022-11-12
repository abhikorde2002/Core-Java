package Abhi;

import java.lang.management.PlatformLoggingMXBean;
import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number :- ");
        int num = scanner.nextInt();
        Pali(num);
    }
     static int Pali(int num){
        int original=num;
        int reverce=0;
        while (num>0){
            int digits=num%10;
            reverce = reverce*10+digits;
            num=num/10;
        }
         System.out.println((original==reverce)?"Its Palindrome number ":"Its not palindrome number");
        return reverce;
    }
}
