package Kunal;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number :-");
        int num=scanner.nextInt();
        int ans=Fact(num);

    }
    static int Fact(int num){
        int Fac=1;
        for (int i=1;i<=num;i++){
            Fac=Fac*i;

        }
        System.out.println("Factorial of " + num+" is " + Fac);


        return Fac;
    }
}
