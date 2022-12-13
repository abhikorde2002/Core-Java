package Sort;

public class Bubble {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        printArr(arr);
        swaped1(arr);
        printArr(arr);
    }

    static void bubble(int arr[]) {
        for (int turn = 0; turn < arr.length - 1; turn++) {
            boolean isSorted = true;
            System.out.println("From outer loop " + turn);
            printArr(arr);
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tem = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tem;
                    isSorted = false;
                }
                System.out.println("From inner loop " + j);
                printArr(arr);
            }
            if (isSorted == true)
                return;
        }

    }

    static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void swaped(int arr[]) {
        for (int turn = 0; turn < arr.length - 1; turn++) {
            int swap = 0;
            System.out.println("From outer loop " + turn);
            printArr(arr);
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tem = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tem;
                    swap++;
                }
                System.out.println("From inner loop " + j);
                printArr(arr);
            }
            if (swap == 0)
                return;
        }
    }

    /*
     * 6 4 1 6 2 3 4 5
     * From outer loop 0
     * 6 4 1 6 2 3 4 5
     * From inner loop 0
     * 4 6 1 6 2 3 4 5
     * From inner loop 1
     * 4 1 6 6 2 3 4 5
     * From inner loop 2
     * 4 1 6 6 2 3 4 5
     * From inner loop 3
     * 4 1 6 2 6 3 4 5
     * 1 2 3 4 4 5 6 6
     */
    static void swaped1(int arr[]) {
        for (int turn = 0; turn < arr.length - 1; turn++) {
            boolean swap = false;
            System.out.println("From outer loop " + turn);
            printArr(arr);
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tem = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tem;
                    swap = true;
                }
                System.out.println("From inner loop " + j);
                printArr(arr);
            }
            if (swap == false)
                return;
        }
    }
    /*
     * 1 2 3 4 5
     * From outer loop 0
     * 1 2 3 4 5
     * From inner loop 0
     * 1 2 3 4 5
     * From inner loop 1
     * 1 2 3 4 5
     * From inner loop 2
     * 1 2 3 4 5
     * From inner loop 3
     * 1 2 3 4 5
     * 1 2 3 4 5
     */

}
