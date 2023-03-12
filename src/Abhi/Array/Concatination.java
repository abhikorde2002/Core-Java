package Abhi.Array;

import java.util.Arrays;

public class Concatination {
    public static void main(String[] args) {
        int []num= {10, 20, 30, 40};
        int arr[]={50,60,70,80};

        System.out.println(Arrays.toString(con(num,arr)));
    }
    static int[] con(int num[],int arr[]){
        int[] ans=new int[2* num.length];
        for (int i=0;i<num.length;i++){
             ans[i]=num[i];
             ans[i+ num.length]=arr[i];
        }
        return ans;
    }
}
