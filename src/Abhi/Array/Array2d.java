package Abhi.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array2d {
    public static void main(String[] args) {
        int [][]array=new int[3][3];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the array element :-");
        for (int i=0;i< array.length;i++){
            for (int j=0;j< array[i].length;j++){
                array[i][j]=scanner.nextInt();
            }
        }

//        //Printing two dimentional array.
//        for (int i=0;i< array.length;i++){
//            System.out.println("\n Row :-"+i);
//            for (int j=0;j< array[i].length;j++){
//                System.out.print(array[i][j]+" ");
//            }
//        }
        for (int row = 0;row< array.length;row++){
            System.out.println(Arrays.toString(array[row]));
        }
//        for (int[] a:array){
//            System.out.println(Arrays.toString(a));
//        }
    }
}
