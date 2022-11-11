import java.util.Scanner;

public class RemainderwithoutOpera {
    public static void main(String[]args){
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter Number1 : ");
        int  number1=s1.nextInt();
        System.out.println("Enter Number2 : ");
        int number2=s1.nextInt();
        int ayush=0;
        while(number1>=number2){
            number1-=number2;
            ayush++;
        }
        System.out.println("The Reminder is "+number1);
    }
}
