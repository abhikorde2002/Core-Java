package Abhi.practiceQuesion;

import java.util.Scanner;

public class Celsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Temperature in Celsius :- ");
        int cel=scanner.nextInt();
        conversion(cel);
    }
    static void conversion(int cel){
        double fahrenheit= (cel*1.8)+32;
        System.out.println("Value of temperature in Fahrenheit :- "+fahrenheit);
    }
}
