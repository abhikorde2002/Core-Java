package Practice_Quesion.Array;

import java.util.Arrays;

class Concate{ 
    public static void main(String[] args) {
        int arr[]={10,20,30,40};
        int num[]={10,20,30,40};
        concat(arr, num);
    }

    static void concat(int arr[],int num[]){
       int ans[]=new int[2*arr.length];
       for(int i=0;i<arr.length;i++){
        ans[i]=arr[i];
        ans[i+arr.length]=num[i];
         
       }  
       System.out.println(Arrays.toString(ans));
    }

 }