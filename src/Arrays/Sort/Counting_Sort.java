package Sort;

public class Counting_Sort {
    public static void main(String[] args) {
        int arr[] = { 1, 4, 1, 3, 2, 4, 3, 7 };
        counting_Sort(arr);
        printArr(arr);
    }

    static void counting_Sort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // sorting
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            System.out.println(i);
            while (count[i] > 0) {

                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    // Output is :- 1 1 2 3 3 4 4 7
}
