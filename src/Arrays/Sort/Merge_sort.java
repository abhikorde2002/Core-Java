package Sort;

public class Merge_sort {
    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        mergeSort(arr, 0, arr.length - 1);
        print(arr);
    }

    public static void mergeSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid + 1, ei);

        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int tem[] = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                tem[k++] = arr[i++];
            } else {
                tem[k++] = arr[j++];
            }
        }

        // for left element of 1st sorted part
        while (i <= mid) {
            tem[k++] = arr[i++];
        }

        // for element of 2nd sorted part
        while (j <= ei) {
            tem[k++] = arr[j++];
        }

        // copy tem to original array
        for (k = 0, i = si; k < tem.length; k++, i++) {
            arr[i] = tem[k];
        }

    }

    static void print(int arr[]) {
        for (int a : arr) {
            System.out.println(a);
        }
    }
}
