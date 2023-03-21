package Practice_Quesion.Series_Program;

import java.util.Scanner;

public class Third_Que {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        thirde(x, n);
    }

    static void thirde(int x,int n){
        int fact=1;
        int sum=1;
        int num=0;
        for(int i=2;i<=(n+1);i++){
            fact=fact*i;
         for(int j=1;j<=n;j++){
             num=(int) Math.pow((1+x),j)/fact;
          
         }
         System.out.println("So series is :- "+num);
         System.out.println("Fact value is:-  " + fact);

        }
    }
}
