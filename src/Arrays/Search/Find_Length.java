package Search;

import java.util.Scanner;

//Find length without using built in function.
public class Find_Length {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int count=0;
        for(int a:arr){
            count++;
        }
        System.out.println(count);

        user_input();
    }

    static void user_input(){
        int count=0;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the size:- ");
        int n=scanner.nextInt();
        int  num[]=new int[n];

        System.out.println("Enter array element:- ");

        for(int i=0; i<n ;i++){
            num[i]=scanner.nextInt();
        }

        for(int a:num){
            count++;
        }
        System.out.println(count);

    }
}
