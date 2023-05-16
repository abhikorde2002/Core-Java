package DSA_100_Days.Day1;

public class Max_Min {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,3};
        minmax(arr);
    }
    
    static void minmax(int arr[]){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];

            }
            else if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Maximum Value is :- "+max);
        System.out.println("Min value :- "+min);
        System.out.println(max - min);
    }
}
