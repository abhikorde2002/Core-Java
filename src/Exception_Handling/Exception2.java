package Exception_Handling;

import java.util.Scanner;

public class Exception2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int a= scanner.nextInt();
        int b= scanner.nextInt();
       
       try{ int c=a/b;
        System.out.println(c);
    }
    catch (Exception e){
        System.out.println("Arithematic exception");
    }
    finally{
        System.out.println("Main method executed");
    }
}
}
