package Practice_Quesion.Series_Program;

import java.util.Scanner;

public class Third_Que {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        int sum=1;
        for(int i=1;i<=n;i++){
          int num=(int) Math.pow((1+x), i);
          int fact=1;
        for(int j=2;j<=(n+1);j++){
            fact=fact*j;
        }  
         
         sum= num/fact;
        }
        System.out.println(sum);
    }
}
