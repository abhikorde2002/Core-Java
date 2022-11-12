package Abhi;

import java.lang.management.MemoryUsage;
import java.nio.channels.MulticastChannel;
import java.util.Scanner;

public class Mathematicle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num=scanner.nextInt();
        Math(num);

    }
    static void Math(int num){

        for (int i=1;i<=10;i++){
        int Multiplication=num*i;
        System.out.println(num+"*"+i+"="+Multiplication);
        }

    }
}
