package Search;

import java.util.Arrays;

public class PrefixofSubArray {
    public static void main(String[] args) {
        int arr[] = { 1, -2, 6, -1, 3 };
        Prefix(arr);
    }

    static void Prefix(int arr[]) {
        int currentSum = 0;
        int MaxSum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];

        prefix[0] = arr[0];
        // Calculate Prifix
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
            
        }
        System.out.println(Arrays.toString(prefix));
        // for (int i : prefix) {
        //     System.out.print(" "+Arrays.toString(i));
        // }

        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                currentSum = start == 0 ? prefix[end] : prefix[end] + prefix[start - 1];
                if (MaxSum < currentSum) {
                    MaxSum = currentSum;
                }
            }
        }
        System.out.println("Max sum is :- " + MaxSum);
    }
}
