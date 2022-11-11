package Kunal.Array.Linearsearch;

public class Min {
    public static void main(String[] args) {
        int arr[]={1,5,2,4,7,8};
        System.out.println(min(arr));
    }

       static int min(int arr[]){
          if (arr.length==0){
              return -1;
          }
          //return min value.
          int Minimum=arr[0];
          for (int i=0;i<=arr.length;i++){
              if (arr[i]<Minimum){
                  Minimum=arr[i];
              }
          }
          return Minimum;
       }
}
