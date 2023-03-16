package Practice_Quesion;

public class Fibonacci_range {
    public static void main(String[] args) {
        int num1 =0;
        int num2=1;
        int num=0;

        //Print the value in Fibonacci series up to 100 Program
System.out.print(num1+" "+num2);

System.out.println();
System.out.print(num1+" "+num2);
without_Recursions(num, num1, num2);
    }

    static void without_Recursions(int num,int num1,int num2){
        
        for(int i=2;i<100;i++){
        num =num1+num2;
        System.out.print(" "+num);
        num1=num2;
        num2=num;
        }
        System.out.println();
    }
}
