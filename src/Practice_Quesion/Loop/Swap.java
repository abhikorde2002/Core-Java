package Practice_Quesion.Loop;

import classcomponent.Methodes.staticMethodes;

public class Swap {
    public static void main(String[] args) {
        swap_(2, 3);
        swap(10, 20);
    }
//Swap of two number using third variable Program
    static void swap_(int num1,int num2){
        int tem=num1;
        num1=num2;
        num2=tem;

        System.out.println(num1+" "+num2);
    }
//Swap of two variable without using third variable Program
//Using Bit Manipulation
    static void swap(int a,int b){
        a=a^b;
        b=a^b;
        a=a^b;

    System.out.println(a+" "+b);

   
}
}
