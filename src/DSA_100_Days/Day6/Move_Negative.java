package DSA_100_Days.Day6;

import java.util.Arrays;

public class Move_Negative {
    public static void main(String[] args) {
       int arr[]={2,3,4,5,-1,-3,-4};
        moves(arr);
        rearange(arr);
    }

    static void moves(int arr[]){
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void rearange(int arr[]){
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                if(i!=j){
                    int tem=arr[i];
                    arr[i]=arr[j];
                    arr[j]=tem;
                }
                j++;
            }
        }
        print(arr);
    }
    
    static void print(int arr[]){
        for(int a:arr){
            System.out.print(a+" ");
        }
    }

}
