package Recursion_Basic;

//First Occurence of an element in an array.
public class find_occurence {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 2, 2 };
        System.out.println(problem(arr, 0, 2));
    }

    static int problem(int arr[], int i, int key) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
             return i;
       
        }
        
        return problem(arr, i + 1, key);
    }
}
