package Practice_Quesion.Loop;

public class Multipliction {
    
    public static void main(String[] args) {
        digits_Mul(234);
    }

    static void digits_Mul(int num){
        int mul=1;
        while(num!=0){
            int dig=num%10;
            mul=mul*dig;
            num=num/10; 
       }
       System.out.println("Multiplication is:- "+mul);
    }
}
