package DSA_100_Days.Day1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Contains_Dup {
    public static void main(String[] args) {
      int arr[]={1,2,3,4,1};
      System.out.println(duplicate(arr)); 
       
    }
/*
First Sort the Array.
Then Compare elements one by one.
We Only have to return a boolean value.
 */
    static boolean duplicate(int arr[]){
         Arrays.sort(arr);
         for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                return true;
            }}
         return false; }

    public static boolean  name(int arr[]) {
     Set<Integer> set = new HashSet<>();
     for(int i=0;i<arr.length;i++){
         if(set.contains(arr[i])){
            return true;
         }
     }
     return false;
}
}
