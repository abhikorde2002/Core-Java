package Backtracking;

public class ChaneArray {
    public static void main(String[] args) {
        int arr[] = new int[5];
        chanegArray(arr, 0, 1);
        printArr(arr);
    }

    static void chanegArray(int arr[], int i, int val) {
        if (i == arr.length) {
            printArr(arr);
            return;
        }
        //
        arr[i] = val;
        chanegArray(arr, i + 1, val + 1);
        arr[i] = arr[i] - 2;
    }

    static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
