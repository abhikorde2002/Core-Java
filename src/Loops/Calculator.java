import java.util.Scanner;

class Calculator{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in );
        System.out.println("Enter the 1 number:- ");
        int num= scanner.nextInt();
        System.out.println("Entre the Operater :- ");
        char ch=scanner.next().charAt(0);
        System.out.println("Enter the second number :- ");
        int num1= scanner.nextInt();
        
        switch (ch){
            case '+':
                System.out.println("Addition of 2 number is :- "+(num+num1));
                break;
            case '-':
                System.out.println("Sustraction of 2 number is :- " +(num-num1));
                break;
            case '*':
               System.out.println("Multiplication of 2 number is :- "+ (num*num1));
               break;
            case '/':
              System.out.println("Division of 2 number is :- "+(num/num1));
              break;
            case '%':
              System.out.println("Reminder of 2 number is :- "+(num%num1));  
              break;
            }
    }
}