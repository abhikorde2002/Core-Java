package Abhi;

public class whithoutmodulesevennumber {
    public static void main(String[] args) {
        eve(100);
    }

    static int eve(int num){
        int sum=0;
        for (int i=2;i<=num;i=i+2){
            sum=sum+i;
        }
        System.out.println("Sum from 2 to"+num+" is " + sum);
        return sum;
    }
}
