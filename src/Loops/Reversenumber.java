import java.util.Scanner;

public class Reversenumber {
    public static void main(String[] args){
        int number;
        System.out.println("Enter the number");
        Scanner s1=new Scanner(System.in);
         number=s1.nextInt();
         int reverse=0;
         int original=number;
         while(number>0){
             int digits=number%10;
             reverse=reverse*10+digits;
             number=number/10;
         }
        System.out.println("Reverse number of"+ original+" is "+reverse);
    }
}
