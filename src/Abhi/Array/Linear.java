package Abhi.Array;

public class Linear {
    public static void main(String[] args) {
        int arr[]={1,2,3,45,5};
        int key=2;
        boolean flag=false;
        for (int i=0;i< arr.length;i++){
            if (key==arr[i]){
                 flag=true;
            }
        }
        System.out.println((flag)?"Key found":"Key not found");
    }
}
