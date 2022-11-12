package Abhi ;

import java.util.Scanner;

public class powerofnumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Base :- ");
        int base=scanner.nextInt();
        System.out.println("Enter the power :-");
        int power=scanner.nextInt();
    }
    static  int power(int power,int base){
        int product=1;

        for (int i=1;i<=power;i++){
            product=product*base;

        }
        System.out.println(base+"raise to "+power+"is "+product);
        return product;

    }

}
