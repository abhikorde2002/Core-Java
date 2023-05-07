 package DSA_100_Days.Day2;

public class MaxSub {
    public static void main(String[] args) {
        System.out.println("Hello");
        int num[]={7, 3, 2, 4, 9, 12, 56};
        // maxSubarray(num);
       MaxSub m =new MaxSub();
      System.out.println( m.maxSubArray(num));

    }

    static void Distribution(int num[]){
        int div=0;

    }

    static void maxSubarray(int arr[]) {
        int max = Integer.MIN_VALUE;
        int currentSum = 0;
        int count = 1;
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
                    count++;
                }
                System.out.print(" ");
            }
        }
        System.out.println("Max sum is :-" + max);
        System.out.println(count);
    }

    public  int maxSubArray(int[] arr) {
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
           sum=sum+arr[i];
           max=Math.max(sum,max); 
          
            if (sum<0)  sum=0;
        }
        return max;
    }
}
