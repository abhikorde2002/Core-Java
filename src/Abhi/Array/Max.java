package Kunal.Array;
//Max value in range.
public class Max {
    public static void main(String[] args) {
    int []arr = {11,22,33,55,66};
        System.out.println(max(arr,1,3));
    }
    static int max(int []arr,int start,int end){
        int ma=arr[0];

// work on edge cases here like array being null.
//       if (end >start){
//           return -1;
//       }
//
//       if (arr==null){
//           return -1;
//       }
//       if(arr.length==0){
//           return -1;
//       }

        for (int i=start;i<=end;i++){
            if (arr[i]>ma){
                ma=arr[i];
            }
        }

        return ma;
    }

}
