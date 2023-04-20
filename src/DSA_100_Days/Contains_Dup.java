package DSA_100_Days;

import java.util.Arrays;

public class Contains_Dup {
    public static void main(String[] args) {
      int arr[]={1,2,3,4,1};
      System.out.println(duplicate(arr));  
    }

    static boolean duplicate(int arr[]){
         Arrays.sort(arr);
         for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                return true;
            }
         }
         return false;
    }
}
