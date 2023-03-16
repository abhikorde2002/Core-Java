package Practice_Quesion.Loop;

public class Fibonacci {
    public static void main(String[] args) {
        int num1 =0;
        int num2=1;
        int num=0;
        System.out.print(num1+" "+num2);
        without_Recursion(num,num1,num2);

        System.out.print(num1+" "+num2);
        with_Recursion(10-2, num, num1, num2);
    }

    static void without_Recursion(int num,int num1,int num2){
        
        for(int i=2;i<10;i++){
        num =num1+num2;
        System.out.print(" "+num);
        num1=num2;
        num2=num;
        }
        System.out.println();
    }
    static void with_Recursion(int n,int num,int num1,int num2){
          if(n>0){
             num=num1+num2;
             System.out.print(" "+num);
             num1=num2;
             num2=num;
             with_Recursion(n-1, num, num1, num2);
          }
    }
}
