import java.util.Scanner;

public class Powerof2number {
    public static void main(String[]args){
        int base;
        int power;
        System.out.println("Enter the base");
        System.out.println("Enter the power");
        Scanner s1=new Scanner(System.in);
         base=s1.nextInt();
         power=s1.nextInt();
         int product=1;
         for(int i=1;i<=power;i++){
             product=product*base;
         }

             System.out.println(base+"riase to"+power+"="+product);


    }
}
