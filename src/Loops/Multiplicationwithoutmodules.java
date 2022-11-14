import java.util.Scanner;

public class Multiplicationwithoutmodules {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the two number :-");
        int num=scanner.nextInt();
        int num1=scanner.nextInt();
        mul(num,num1);
    }
    static int mul(int num,int num1){
        int sum=0;
        for (int i=1;i<=num1;i++){
            sum=sum+num;
        }
        System.out.println("Multiplication of "+num+"and "+num1 + " is " +sum);
        return sum;
    }
}
