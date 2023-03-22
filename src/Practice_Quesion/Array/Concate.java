package Practice_Quesion.Array;

import java.util.Arrays;

class Concate{ 
    public static void main(String[] args) {
        int arr[]={10,20,30,40};
        int num[]={50,60,70,80};
        concat(arr, num);
    }

    static void concat(int arr[],int num[]){
       int ans[]=new int[2*arr.length];
       for(int i=0;i<arr.length;i++){
        ans[i]=arr[i];
        ans[i+arr.length]=num[i];
         
       }
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
      
       System.out.println(Arrays.toString(ans));
    }

 }