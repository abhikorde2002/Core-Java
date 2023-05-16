package DSA_100_Days.Day8;

import java.util.Arrays;

public class Remove {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,5,6,6};
        removeDuplicates(arr);
    }

    static void removeDuplicates(int []nums) {
        int ans = 1;
       for(int i = 1; i <nums.length-1; ++i)
           if(nums[i] != nums[i - 1])  {  
               nums[ans] = nums[i]; 
               ++ans; 
           }
         
       System.out.println(Arrays.toString(nums));


   }
   static void print(int arr[]){
    for(int a:arr){
        System.out.println(a);
    }
   }

}
