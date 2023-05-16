package Abhi.Array;

import java.util.Arrays;

public class swap {
    public static void main(String[] args) {
        int []arr = {1,2,33,55,66};
       // swa(arr,1,3);
        s(arr);
 //       swa(arr,2,1);
 //       swa(arr,3,4);
        System.out.println(Arrays.toString(arr));
    }
    static void s(int arr[]){
      for (int i=0;i< arr.length/2;i++){
          int tem=arr[arr.length-1-i];
          arr[arr.length-1-i]=arr[i];
          arr[i]=tem;
          break;
      }
    }
    static void swa(int []arr,int index1,int index2){
        int tem = arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=tem;
    }
}
