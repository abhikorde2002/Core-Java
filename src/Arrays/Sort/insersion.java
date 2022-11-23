package Sort;

public class insersion {
    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        insert(arr);
    }

    static void insert(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
            System.out.println("From outer loop " + curr);
            printArr(arr);
            // Finding out the correct pos to inset
            while (prev >= 0 && arr[prev] < curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }

            // insersion
            arr[prev + 1] = curr;
            System.out.println("From inner loop " + prev);
            printArr(arr);
        }
        printArr(arr);
    }
    /*
     * From outer loop 4
     * 5 4 1 3 2
     * From inner loop -1
     * 4 5 1 3 2
     * From outer loop 1
     * 4 5 1 3 2
     * From inner loop -1
     * 1 4 5 3 2
     * From outer loop 3
     * 1 4 5 3 2
     * From inner loop 0
     * 1 3 4 5 2
     * From outer loop 2
     * 1 3 4 5 2
     * From inner loop 0
     * 1 2 3 4 5
     * 1 2 3 4 5
     */

    static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
