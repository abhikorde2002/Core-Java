package Practice_Quesion.Array;

import java.util.Arrays;

public class Two_array {
    public static void main(String[] args) {
        int arr[]={10,20,30,40};
        int num[]={50,60,70,80};
        int ans[]=new int[2*arr.length];
        concats(arr, num, ans);
        isDuplicate(ans);
        // concat(arr, num,ans);
    }

    static void concats(int arr[],int num[],int ans[]){
        
        for(int i=0;i<arr.length;i++){
         ans[i]=arr[i];
         ans[i+arr.length]=num[i];
          
        }
        System.out.println(Arrays.toString(ans));
     }

     static void isDuplicate(int ans[]){
        boolean flag=false;
        for(int i=0;i<ans.length;i++){
         for(int j=i+1;j<ans.length;j++){
            if(ans[i]==ans[j]){
               flag=true;
            }
         } 
        }
        if(flag==true){
         System.out.println("Arrays contain the same elements");
        }
        else{
         System.out.println("Arrays not contain the same elements");
        }
       
     }

    
}
