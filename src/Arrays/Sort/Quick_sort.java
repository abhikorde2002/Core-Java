package Sort;

public class Quick_sort {
    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 8, 2, 5 };
        quickSort(arr, 0, arr.length - 1);
        print(arr);
    }

    static void quickSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        // last element
        int pindx = partition(arr, si, ei);
        quickSort(arr, si, pindx - 1);
        quickSort(arr, pindx + 1, ei);
    }

    static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1;// to make place for els smaller than pivot

        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;

            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }

    static void print(int arr[]) {
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
