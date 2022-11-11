package Kunal.Array.Binearysearch;

public class CellingOfNumber {
    public static void main(String[] args) {
        int num[]={2,3,5,8,14,16,18};
        int target=17;
        int ans=cel(num,target);
        System.out.println(ans);
    }

    static int cel(int num[],int target){
     int start= 0;
     int end=num.length-1;

     while (start<=end){
         int mid=start+(end-start)/2;

         if (target>num[mid]){
             start=mid+1;
         }
         else if (target<num[mid]){
             end=mid-1;
         }
         else if (target== num[mid]){
             return mid;
         }
     }
      return start;
   }


}
