package Digites;

import java.util.Scanner;

public class DigitesMultiplication {
    public static void main(String[] args) {
        int mul=1;  
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter the number :-");
    int num=scanner.nextInt();   
    while(num!=0){
        int dig=num%10;
        mul=mul*dig;
        num=num/10; 
   }
   System.out.println("Multiplication is:- "+mul);
    }
  }

