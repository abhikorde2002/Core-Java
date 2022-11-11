package Kunal.Array;

import java.util.Arrays;

public class Duplicate {
    public static void main(String[] args) {
       int []arr = {10,20,20,30,40};
        System.out.println(Arrays.toString(remove(arr)));
    }
    static int[] remove(int[] arr){
        int index=0;
        int res[]=new int[arr.length];
        boolean flag=false;

        Arrays.sort(arr);

        for (int j=0; j< arr.length-1;j++){
            if (arr[j]==arr[j+1]){
                flag=true;
                index=j;
                break;
            }
            res [j]=arr[j];
        }
        for (int i=index;i<res.length -1;i++){
            res[i]=arr[i+1];
        }
        for (int a:res){
            System.out.println(a);
        }
       return arr;
    }
}
