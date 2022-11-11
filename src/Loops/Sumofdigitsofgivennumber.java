import java.util.Scanner;

public class Sumofdigitsofgivennumber {
    public static void main(String[] args){
        System.out.println("Enter the number");
        Scanner s1=new Scanner(System.in);
        int number=s1.nextInt();
        int original=number;
        int sumofdigits =0;

        while(number>0){
            int digits=number%10;
            sumofdigits=sumofdigits+digits;
            number=number/10;
        }
        System.out.println("Sumofdigits"+original+ " "+sumofdigits);
    }
        }
