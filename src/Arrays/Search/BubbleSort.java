package Search;

// import classcomponent.Methodes.staticMethodes;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = { 6, 4, 1, 6, 2, 3, 4, 5 };
        printArr(arr);
        swaped(arr);
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

}
