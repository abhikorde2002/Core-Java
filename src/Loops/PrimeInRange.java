import java.util.Scanner;

public class PrimeInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the range:- ");
        int num=scanner.nextInt();
        for(int i=2;i<=num;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }

    static  boolean isPrime(int n){
        boolean isPrime=true;
        if(n==2){return true;}
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }           
        }
        return isPrime;
    }
}
