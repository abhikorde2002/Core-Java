package Practice_Quesion.Array;
//How do you find the second largest number in an array in Java?
import java.util.Arrays;

public class Secod_Large {
    public static void main(String[] args) {
       int arr[]={4,5,3,2};
       Second(arr);
       Secon_Large(arr);
    }   
    
    static void Second(int arr[]){
        int size=arr.length;
        Arrays.sort(arr);
        int ans=arr[size-3];
        System.out.println(ans);
      }

      static void Secon_Large(int arr[]){
        for (int turn = 0; turn < arr.length - 1; turn++) {
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tem = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tem;
                }      
            }
            int ans=arr[arr.length-3];
            System.out.println(ans);        
        }
      }
    }

