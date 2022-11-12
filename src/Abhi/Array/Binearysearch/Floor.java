package Abhi.Array.Binearysearch;

public class Floor {
    public static void main(String[] args) {
     int num[]={2,3,4,5,6,8,12,15};
     int target=14;
     int ans=flo(num,target);
        System.out.println(ans);
    }

    static int flo(int num[],int target){
        int start=0;
        int end=num.length-1;

        while (start<=end){
            int mid=start+(end-start)/2;
            if (target>=num[mid]){
                start=mid+1;
            }
            else if (target<=num[mid]){
                end=mid-1;
            }
            else if (target==num[mid]){
                return mid;
            }
        }
        return end;
    }
}
