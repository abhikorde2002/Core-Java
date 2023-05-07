package DSA_100_Days.Day3;

public class Reverse {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        rev(arr);
    }

    static void rev(int arr[]){
        for(int i=0;i<arr.length/2;i++){
              int tem=arr[i];
              arr[i]=arr[arr.length-1-i];
              arr[arr.length-1-i]=tem;
        }
        for(int a: arr){
            System.out.println(a);
        }
    }
}
