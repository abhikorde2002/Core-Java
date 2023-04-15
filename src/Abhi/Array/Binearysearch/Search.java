package Abhi.Array.Binearysearch;

public class Search {
    public static void main(String[] args) {
        int arr[]={-5,-1,0,2,3,4,5,12,15};
        int target=12;
        int ans=binarySearch(arr,target);
        System.out.println(ans);

    }
    static int binarySearch(int []arr,int target){
        int start=0;
        int end=arr.length-1;

        while (start<=end){
            //finding the middle element .
            //int mid= (start+end)/2 may exceed the int value.
            int mid = start +(end-start)/2;

            if (target <arr[mid]){
                end= mid -1;
            }
            else if (target >arr[mid]){
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
