package DSA_100_Days.Day3;

import java.util.Arrays;
import java.util.Vector;

public class NextPermutation {
    public static void main(String[] args) {
        int num[]={1,2,3};
        NextPermutation n = new NextPermutation();
      n.next(num);
    }

    void next(int []nums){
        // if(num.length==1){
        //     return ;
        // }
        // int idx1=-1;
        // for(int i=num.length-2;i>=0;i--){
        //     if(num[i]<num[i+1]){
        //         idx1=i;
        //         break;
        //     }
        // }

        // if(idx1 <0){
        //     Arrays.sort(num,0,num.length);
        //     return;
        // }
        // for(int i=num.length-1;i>idx1;i--){
        //     if(num[idx1]<num[i]){
        //         int tem= num[i];
        //         num[i]=num[idx1];
        //         num[idx1]=tem;
        //         break;
        //     }
        // }
        int n = nums.length;
        // store the breaking point
        int idx = -1;

        for(int i = n-2 ; i>=0 ; i--) {
            if(nums[i] < nums[i+1]) {
                idx = i;
                break;
            }
        }
        
        // base case - no breakpoint found
        if(idx == -1) {
            Arrays.sort(nums, 0, n);
            return;
        }


        // finding the greater but closest num
        for(int i=n-1 ; i>idx ; i--) {
            if(nums[i] > nums[idx]) {
                int temp = nums[i];
                nums[i] = nums[idx];
                nums[idx] = temp;
                break;
            }
        }
        // Reversing the remaining array.
       Arrays.sort(nums, idx+1, n);
       System.out.println(Arrays.toString(nums));

    }
}
