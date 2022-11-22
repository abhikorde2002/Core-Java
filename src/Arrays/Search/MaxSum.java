package Search;

public class MaxSum {
    public static void main(String[] args) {
        int arr[] = { 1, -2, 6, -1, 3 };
        maxSubarray(arr);
    }

    static void subarray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k]);
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    /*
     * 2 24 246 2468 246810
     * 4 46 468 46810
     * 6 68 6810
     * 8 810
     * 10
     */
    static void maxSubarray(int arr[]) {
        int max = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                currentSum = 0;
                for (int k = start; k <= end; k++) {
                    currentSum += arr[k];
                }
                System.out.println(currentSum);
                if (currentSum > max) {
                    max = currentSum;
                }
                System.out.print(" ");
            }
        }
        System.out.println("Max sum is :-" + max);
    }
}
