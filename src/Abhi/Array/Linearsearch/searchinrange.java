package Abhi.Array.Linearsearch;

public class searchinrange {
    public static void main(String[] args) {
      int arr[]={10,20,30,40,50,60,70,80};
      int target=50;
        System.out.println(linear(arr,target,1,5));

    }

    static int linear(int arr[],int target,int start,int end){
        if (arr.length==0){
            return -1;
        }

        for (int i=start;i<=end;i++){
            if (target==arr[i]){
                return i;
            }
        }
        return -1;
    }

}
