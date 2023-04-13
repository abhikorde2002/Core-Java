package Practice_Quesion.Array;

import java.util.Arrays;

public class TwoArray {
    public static void main(String[] args) {
     Object o[]={1,2,3,4,5};
     Object i[]={1,2,3,4,5};
     Object a[]={2,3,4,5,7};


     Arrays.sort(o);
     Arrays.sort(i);

     boolean arrs=Arrays.equals(o, i);
     System.out.println("Array o and i are equal :-"+arrs);
     
     boolean str=Arrays.equals(i, a);
     System.out.println("Array i and a are equal :- "+str);
     
     int arr[]={1,2,3,4,5};
     int num[]={ 1,2,3,4,5 };
     check(arr,num);
    }

    static void check(int arr[],int num[]){
        boolean flag=true;
        if(arr.length==num.length){
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=num[i]){
               flag = false;
            }
        }
      }
      else{
        flag = false;
      }
      System.out.println((flag==true)?"This Two Arrays Are Equals" : "This Two Arrays Are not equals");
    }


}
