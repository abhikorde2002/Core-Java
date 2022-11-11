package Kunal.Array.Binearysearch;

public class OrderAgnosticBinearySearch {
    public static void main(String[] args) {
          // int []arr={-18,-10,-5,-1,0,2,4,5,6,7,12,13,15,20,22,25};
           int []arr={33,23,11,10,9,7,6,5,3,1,0,-1,-2,-5,-6};
           int target=23;
           int ans = order(arr,target);
           System.out.println(ans);
    }

    static int order(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;

        //finding whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {

            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }

            if ((isAsc)) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else if (target < arr[mid]) {
                    end = mid - 1;
                }
            } else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else if (target > arr[mid]) {
                    end = mid - 1;
                }
            }
        }
            return -1;
    }
}