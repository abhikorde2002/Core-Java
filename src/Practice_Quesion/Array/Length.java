package Practice_Quesion.Array;

public class Length {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        len(arr);
    }

    static void len(int arr[]){
        int cou=0;
        for(int a: arr){
          cou++;
        }
        System.out.println(cou);

    }
}
