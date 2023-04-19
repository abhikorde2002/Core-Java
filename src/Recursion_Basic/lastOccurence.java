package Recursion_Basic;

public class lastOccurence {
    public static void main(String[] args) {
        int arr[] = { 7, 6, 5, 4, 6, 8, 2 };
        System.out.println(lastoccurence(arr, 5, 0));
    }

    static int lastoccurence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastoccurence(arr, key, i + 1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }
}
