package DSA_100_Days.Day6;

import java.util.Arrays;

public class Cyclically {
    
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        swap(arr, 5);
    }

    static void swap(int arr[],int n){
        for (int i=0;i< arr.length-1;i++){
            int tem = arr[n-1];
            arr[n-1]=arr[i];
            arr[i]=tem;
             }

             System.out.println(Arrays.toString(arr));
    }
}
