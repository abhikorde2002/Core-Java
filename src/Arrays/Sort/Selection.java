package Sort;

public class Selection {
    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 1, 2 };
        System.out.println("Incresing Selection sort :- ");
        increasing(arr);
        System.out.println("Decresing Selection sort :-  ");
        decreasing(arr);
    }

    static void increasing(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            // System.out.println("From outer loop " + i);
            // printArray(arr);
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
                // System.out.println("From inner loop " + j);

            }
            int tem = arr[min];
            arr[min] = arr[i];
            arr[i] = tem;

        }
        printArray(arr);
        System.out.println();
    }

    static void decreasing(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int max = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[max] < arr[j]) {
                    max = j;
                }
            }
            int tem = arr[max];
            arr[max] = arr[i];
            arr[i] = tem;
        }
        printArray(arr);
    }

    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
