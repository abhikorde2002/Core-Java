package Sort;
//Sorted & Roted Array

public class Sorted {
    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int tar = 6;
        int tarIndex = search(arr, tar, 0, arr.length - 1);
        System.out.println(tarIndex);
    }

    static int search(int arr[], int tar, int si, int ei) {
        if (si > ei) {
            return -1;
        }
        // mid
        int mid = si + (ei - si) / 2;

        // case found
        if (arr[mid] == tar) {
            return mid;
        }

        if (arr[si] <= arr[mid]) {
            // case a: left
            if (arr[si] <= tar && tar <= arr[mid]) {
                return search(arr, tar, si, mid - 1);
            }
            // case b:right
            else {
                return search(arr, tar, mid + 1, ei);
            }
        } else {
            // case c:right
            if (arr[mid] <= tar && tar <= arr[ei]) {
                return search(arr, tar, mid + 1, ei);
            } else {
                return search(arr, tar, si, mid - 1);
            }
        }
    }
}
