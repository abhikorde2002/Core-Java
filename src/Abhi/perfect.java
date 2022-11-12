package Abhi;

import java.util.Scanner;

public class perfect {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num= scanner.nextInt();
        per(num);
    }
    static int per(int num){
        int sum=0;
        for (int i=1;i<=num/2;i++){
            if (num%i==0){
                sum=sum+i;
            }
        }
        System.out.println((num==sum)?"Its perfect number ":"Its not perfect number");
        return sum;
    }
}
