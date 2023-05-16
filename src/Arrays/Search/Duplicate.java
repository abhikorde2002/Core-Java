package Search;

import java.util.Arrays;

public class Duplicate {
    public static void main(String[] args) {
        int num[] = { 1, 2, 3, 4, 5, 6, 6, 2 };
    //     System.out.println(duplic(num));
    //     int n=num.length;
    //     // System.out.println(dep(num, n));
    //     duplic(num);
    //     // dupli(num);
    //     // duplic1(num);
    //     int length=num.length;

    //     length= dep(num, length);
    //     for(int i=0;i<length;i++){
    //   System.out.println(num[i]+" ");
    //     }
    System.out.println(duplic(num));
    }

    static void dupli(int arr[]) {
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length - 1; j++) {
                if (arr[i] == arr[j ]) {
                    flag = true;
                }
            }

        }
        System.out.println(flag ? "Duplicate" : "Not Duplicate");

    }

    static int dep(int arr[],int n){
       if(n==1 || n==0){
        return n;
       }
       int [] tem= new int[n];
       int j=0;
       for(int i=0;i<n-1;i++){
       if(arr[i]!=arr[j+1]){
        tem[j++]=arr[i];
       }
       }

       tem[j++]=arr[n-1];
       for(int i=0;i<j;j++){
        arr[i]=tem[i];
       }
       return j;   
    }
    static int duplic(int arr[]) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans = ans ^ arr[i] ^ i;

        }
        return ans;
    }

    static void duplic1(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(j);
                }
            }

        }

    }
    static int Duplicates(int arr[],int n){
        if (n == 0 || n == 1) {
            return n;
        }
        Arrays.sort(arr);  
        int j = 0;
        for ( int i = 0; i < n ; i++) {
            if (arr[i] != arr[i-1]) {
                arr[++j] = arr[i];
            }
        }
        return j;
    }
}
