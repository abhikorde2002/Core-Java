import java.util.Scanner;

public class firshnevennumber {
    public static void main(String[]args){
        int number;
        int sum=0;
        System.out.println("Enter the number");
        Scanner s1=new Scanner(System.in);
        number=s1.nextInt();

        for(int i=0;i<=number;i++ ) {
            if(i%2==0){
            sum = sum + i;
                System.out.println(i+" "+sum);
            }
        }
            System.out.println(sum);

        }
    }

