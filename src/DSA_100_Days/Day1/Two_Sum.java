package DSA_100_Days.Day1;
// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
public class Two_Sum {
    public static void main(String[] args) {
        int num[]={1,2,7,5};
        toSum(num, 12);
        // sum(num, 9);
        // printArr(num);

    }

    static  void toSum(int num[],int target){
        int arr[]=new int[2];
        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                if(num[i]+num[j]==target){
                    arr[0]=i;
                    arr[1]=j;
                }}}
       for (int i : arr) {
        System.out.println(i);
       }}

    // static void sum(int num[],int target){
    //     final int N = num.length;
    //     int[] arr = new int[2];
    //     for(int i=0;i<N; i++){  // Valid answer must be there before end of loop
    //         for(int j=i+1; j < N; j++){
    //             if(num[i] + num[j] == target){
    //                 arr[0] = i; arr[1] = j;
    //                 return arr;
    //             }
    //             printArr(arr);
    //         }}
        
    // }
    // static void printArr(int arr[]) {
    //     for (int i = 0; i < arr.length; i++) {
    //         System.out.print(arr[i] + " ");
    //     }
    //     System.out.println();
    // }
}
