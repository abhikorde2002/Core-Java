package Practice_Quesion.Series_Program;

import java.net.Socket;
import java.util.Scanner;

class First_Quesion{
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Inter the value:- ");
    int n=sc.nextInt();    
    double sum=0;

    for(int i=1;i<=n;i++){
        double fact=1;

        for(int j=1;j<=i;j++){
            fact=fact*j;
        }
        sum=sum+(double)(i/fact);
    }
    System.out.println(sum);

    }

    
}