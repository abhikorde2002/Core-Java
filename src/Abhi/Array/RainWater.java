package Abhi.Array;

public class RainWater {
    public static void main(String[] args) {
        int arr[]={3,8,5,4,6,9,0};
        System.out.println(rainwater(arr));
    }
    static int rainwater(int []arr){
        int low =0;
        int high= arr.length-1;
        int maxLeft=arr[low];
        int maxRight=arr[high];
        int water=0;
        while (low < high){
            if (arr[low] >arr[high]){
                low++;
                maxLeft=Math.max(maxLeft,arr[low]);
                water= water +maxLeft-arr[low];
            }
            else {
                high--;
                maxRight=Math.max(maxRight,arr[high]);
                water = water+maxRight-arr[high];
            }
        }
        return water;
    }
}
