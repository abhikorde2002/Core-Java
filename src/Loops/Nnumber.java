import java.util.Scanner;

public class Nnumber {
    public static void main(String[]args){
        int number;
        int sum=0;
        System.out.println("Enter the Number");
        Scanner s1=new Scanner(System.in);
        number=s1.nextInt();
        for(int i=0;i<=number;i++){
            sum =sum+i;
            System.out.println(i+" "+sum);
        }
        System.out.println(sum+"is the sum of given number");


    }
}
/*  i=0,n=5,
    i=1,n=5,
    sum=0+1=1






 */