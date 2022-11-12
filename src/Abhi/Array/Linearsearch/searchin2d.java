package Abhi.Array.Linearsearch;

import java.util.Arrays;

public class searchin2d {
    public static void main(String[] args) {
        int [][]arr={
                {1,2,3},
                {39,69,65},
                {5,77,33}
        };
        int key=5;
        int[] ans=sea(arr,key);
        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
    }

    static int[] sea(int arr[][],int key){
        for (int row=0;row<arr.length;row++){
            for (int col=0;col<arr[row].length;col++){
                if (arr[row][col]==key){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }

    static int max(int arr[][]){
        int max=Integer.MIN_VALUE;

        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt > max) {
                    max = anInt;
                }
            }
        }
        return max;
    }
}


