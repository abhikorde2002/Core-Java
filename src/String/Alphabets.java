package String;

import java.util.Scanner;

public class Alphabets {
    public static void main(String[] args) {
        char ch=' ';
        alpha1(ch);
        alpha("Abhishek2");
    }

    static void alpha1(char ch) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value:-");
        ch = sc.next().charAt(0);
        if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
            System.out.println("Alphabets");
        } else {
            System.out.println("Its Not alphabet");
        }
    }

    static void alpha(String str) {
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
                 System.out.println(ch + " is Alphabets");
            } else {
                System.out.println(ch + " is Not alphabet");
            }
        }
    }
}
