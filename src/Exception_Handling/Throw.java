package Exception_Handling;

import java.util.Scanner;

public class Throw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 number:- ");
        int a=scanner.nextInt();
        System.out.println("Enter the 2 number:- ");
        int b=scanner.nextInt();
        int c = a-b;
        
       try{
        if(a>b){
            System.out.println("Substraction of this two number is:- "+ c);
        }
        else{
            // AisLessB ab= new AisLessB();
            // throw ab;
            throw new AisLessB();
            
        }
       }
       catch (Exception e){
        System.out.println(e.getMessage());
        System.out.println("Exception caught");
       }
       System.out.println("Exiting main normally");
    }
}
class AisLessB extends Exception {
    AisLessB(){
        System.out.println("A is less than B");
    }
}
/*
 * Enter 1 number:- 
23
Enter the 2 number:- 
24
A is less than B
Exception caught
Exiting main normally
 */