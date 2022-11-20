package Search;

public class MaxandMin {
    public static void main(String[] args) {
        int arr[] = { -2, -4, -3, -1 };
        max(arr);
        min(arr);
    }

    static void max(int arr[]) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];

            }

        }
        System.out.println(max);
    }

    static void min(int arr[]) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

        }
        System.out.println(min);
    }

}
