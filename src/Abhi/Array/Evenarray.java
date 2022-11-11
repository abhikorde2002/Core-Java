package Kunal.Array;

import java.util.Arrays;

public class Evenarray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        search(arr);
    }
    static void search(int[] arr){
        for (int i=0;i<arr.length;i++){
            if (arr[i]%2==0){
                System.out.println(arr[i]);
            }
        }
    }
}

