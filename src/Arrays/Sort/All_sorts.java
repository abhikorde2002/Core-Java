package Sort;

public class All_sorts {
    public static void main(String[] args) {
        // for Decending array sort.
        // int arr[] = { 1, 2, 3, 4, 5 };
        // bubble_Sort(arr);

        // for Acending array sort.
        // int arr[]={5,4,3,1,2};
        // printArr(arr);

        // Selection sort
        int arr[] = { 5, 4, 1, 3, 2 };
        selection(arr);
        selection_sort(arr);
        insersion(arr);

    }

    static void bubble_Sort(int arr[]) {
        // Sort Array in Decending order.
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.println("Outer loop :- " + i);
            printArr(arr);

            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int tem = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tem;
                }
                System.out.println("Inner loop :- " + j);
                printArr(arr);
            }
        }
    }

    static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void bubble(int arr[]) {
        // Sort array in acending order
        for (int i = 0; i < arr.length - 1; i++) {
            boolean isSort = false;
            System.out.println("Outer loop :- " + i);
            printArr(arr);

            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tem = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tem;
                    isSort = true;
                }
                System.out.println("Inner loop :- " + j);
                printArr(arr);
                if (isSort == false) {
                    return;
                }
            }
        }
    }

    static void buuble_sort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int isSort = 0;
            System.out.println("Outer loop :- " + i);
            printArr(arr);

            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tem = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tem;
                    isSort++;
                }
                System.out.println("Inner loop :- " + j);
                printArr(arr);
                if (isSort == 0) {
                    return;
                }
            }
        }
    }

    static void selection(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            int tem = arr[min];
            arr[min] = arr[i];
            arr[i] = tem;

        }
        printArr(arr);
    }

    static void selection_sort(int arr[]) {
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
        printArr(arr);
    }

    static void insersion(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int cure = arr[i];
            int prev = i - 1;

            while (prev >= 0 && arr[prev] < cure) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = cure;
        }
        printArr(arr);
    }
}
