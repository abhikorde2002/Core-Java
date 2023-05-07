package DSA_100_Days.Day3;

import java.util.Arrays;

public class Single_number {
    public static void main(String[] args) {
        int arr[]={1,2,2};
        single(arr);
    }

    static void single(int num[]){
        Arrays.sort(num);
        for(int i=0;i<num.length-1;i++){
            if(num[i]!=num[i+1]){
               System.out.println(num[i]);
            }
        }
    }

    
        public int singleNumber(int[] nums) {
           Arrays.sort(nums);
    for(int i = 0;i < nums.length - 1;i++){
               if(nums[i] != nums[i + 1]){
                   return nums[i];}
               i++;
    }return nums[nums.length - 1];}
               
}

    

