package Search;

public class BinearySearch {
    public static void main(String[] args) {
        int num[] = { 2, 4, 6, 8, 9 };
        System.out.println(bine(num, 8));
    }

    static int bine(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > key) {
                end = mid - 1;
            }
            if (arr[mid] < key) {
                start = mid + 1;
            }
            if (arr[mid] == key) {
                return mid;
            }
        }
        return -1;
    }
}
