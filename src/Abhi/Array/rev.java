package Kunal.Array;

import java.util.Arrays;

public class rev {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int []arr){
        int start=0;
        int end= arr.length-1;

        while (start<end){

            swaping(arr,start,end);
            start++;
            end--;
        }

    }
    static void  swaping(int []arr,int indx,int ind2){
        int tem=arr[indx];
        arr[indx]=arr[ind2];
        arr[ind2]=tem;
    }
}
