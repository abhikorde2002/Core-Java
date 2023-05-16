package DSA_100_Days.Day8;

import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,3,2,1};
        // Arrays.sort(arr);
        int length=arr.length;
        // System.out.println(remov(arr, length));
       //removeduplicates(arr, length);
       length = removeDuplicateElements(arr, length);  
       //printing array elements  
    //    for (int i=0; i<length; i++)  
    //       System.out.print(arr[i]+" ");  

          remove(arr);
   }  
    
   static void remove(int arr[]){
    int ans=1;
    Arrays.sort(arr);
    for(int i=0;i<arr.length-1;i++){
        if(arr[i]!=arr[i+1]){
            arr[ans++]=arr[i+1];
        }
    }
    for (int i=0; i<ans; i++)  
    System.out.print(arr[i]+" ");  
   }
   

   
       
    
    public static int removeDuplicateElements(int arr[], int n){  
        if (n==0 || n==1){  
            return n;  
        }  
        Arrays.sort(arr);
        int[] temp = new int[n];  
        int j = 0;  
        for (int i=0; i<n-1; i++){  
            if (arr[i] != arr[i+1]){  
                temp[j++] = arr[i];  
            }  
         }  
        temp[j++] = arr[n-1];     
        // Changing original array  
        for (int i=0; i<j; i++){  
            arr[i] = temp[i];  
        }  
        return j;  
    }  
}
