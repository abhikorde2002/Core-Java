package classcomponent;

import java.util.Arrays;
import java.util.Scanner;

public class varArgs {
    public static void main(String[] args) {
     //  fun(2,3,4,5,6);
        int num=3;
        int arr[]=new int[num];
        ave(1,2);
        // System.out.println("Average is:- " +average(12,23,34,55));
       //we can take any number of values hear.
//        add(1,5,77,44,44,22,77);
//        mul(2,5,"Abhi","Kunal","Jack");

    }
    static void mul(int a,int b,String ...v){
        System.out.println(a+" "+b+" "+Arrays.toString(v));
    }
    static void add(int a,int b,int ...v){
        System.out.println(a+" "+b+""+Arrays.toString(v));
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static int average(int ...v){
        int result=0;
        for(int i:v){
            result +=i;
        }
        return(result/v.length);
    }
    static void ave(int ...arr){
          int result=0;
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Enter the Var Args Numbers:-");
//
//        for (int i=0;i<arr.length;i++){
//            arr[i]=scanner.nextInt();
//        }
        for(int i=0;i<arr.length;i++){
            result +=arr[i];
        }
        System.out.println("Average of array is:-"+(result/arr.length));

    }
}
