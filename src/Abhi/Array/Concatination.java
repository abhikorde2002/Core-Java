package Abhi.Array;

import java.util.Arrays;

public class Concatination {
    public static void main(String[] args) {
        int []num= {10, 20, 30, 40};
        System.out.println(Arrays.toString(con(num)));
    }
    static int[] con(int num[]){
        int[] ans=new int[2* num.length];
        for (int i=0;i<num.length;i++){
             ans[i]=num[i];
             ans[i+ num.length]=num[i];
        }
        return ans;
    }
}
