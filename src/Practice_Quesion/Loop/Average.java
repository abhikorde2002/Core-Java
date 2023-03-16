package Practice_Quesion.Loop;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the n number :-");
        int num=scanner.nextInt();
        int sum=0;
        int count=1;
        for (int i=1;i<=num;i++){
            System.out.println("Enter the "+count+"number :- ");
            float x=scanner.nextInt();
            sum=sum+i;
            count++;
        }
        System.out.println(sum);
        int average=sum/num;
        System.out.println("Average of n number is :- "+average);
    }
}
