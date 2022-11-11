package FinalKeyword;

import java.util.Scanner;

public class Finalmethod {
    //If you create method as a final then you can't Override the methods

    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Finalmethod finalmethod = new Finalmethod();
        Finalmethod.Inn inn =finalmethod.new Inn();
        inn.show1();
    }
    class Inn{
        Scanner scanner = new Scanner(System.in);
        int number=scanner.nextInt();

      public final void show1(){
          if (number%2==0){
              System.out.println("Even number is : " +number);
          }
          else{
              System.out.println("Odd number is : " +number);
          }
      }
    }

}
