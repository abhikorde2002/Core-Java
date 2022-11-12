package Abhi.Array;

import java.util.Arrays;

public class dup {
    public static void main(String[] args) {
        int []nums={1,1,2,2,5,2};
        System.out.println(re(nums));
    }
    static int re(int []nums){
        int pos=1;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
                nums[pos++]=nums[i+1];
            }
        }
        return pos;

    }
}
