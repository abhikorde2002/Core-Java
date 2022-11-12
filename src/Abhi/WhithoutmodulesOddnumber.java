package Abhi;

public class WhithoutmodulesOddnumber {
    public static void main(String[] args) {
        odd(100);
    }

    static int odd(int num){
        int sum=0;
        for (int i=1;i<=num;i=i+2){
            sum=sum+i;
        }
        System.out.println("Sum from 1 to"+num+"odd number is "+sum);
        return sum;
    }
}
