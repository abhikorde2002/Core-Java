package DSA_100_Days.Day3;

import java.util.Arrays;

public class Missing {
    public static void main(String[] args) {
        int arr[]={0,3,1};
        missing(arr);
        miss(arr);
    }

    static void missing(int num[]){
        int count=0;
        Arrays.sort(num);
        for(int i=0;i<num.length;i++){
          if(num[i]!=count){
             System.out.println(count);
          }
          count++;
        }
    }

    static void miss(int arr[]){
        int sum=0;
        int size=arr.length;
        for (int i : arr) {
            sum+=i;
        }
        System.out.println((size * (size+1))/2 -sum);
    }
}
