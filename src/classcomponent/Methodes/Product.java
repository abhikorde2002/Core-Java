package classcomponent.Methodes;

public class Product {
    public static void main(String[] args) {
        int prode=mul(5, 5);
        System.out.println(prode);
        int fact=1;
        System.out.println(factorial(5, fact));
        System.out.println(factRecursion(5));
    }
    static int mul(int a,int b){
        int product=a*b;
        return product;
    }
    static int factorial(int num,int fact){
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        return fact;
    }
    static int factRecursion(int num){
        if(num==0){
            return 1;
         
        }
        else{
            return num*factRecursion( num-1);
        }
    }
}
