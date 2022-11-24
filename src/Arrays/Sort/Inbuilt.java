package Sort;

import java.util.Arrays;
import java.util.Collections;

public class Inbuilt {
    public static void main(String[] args) {
        Integer arr[] = { 5, 4, 1, 3, 2 };

        Arrays.sort(arr, 0, 3, Collections.reverseOrder());
        Quick(arr);
        // 5 4 1 3 2
        // Arrays.sort(arr, Collections.reverseOrder());
        // Quick(arr);
        // 5 4 3 2 1

        // Using Index sorting array.
        // Arrays.sort(arr, 0, 3);
        // selection(arr);
        /*
         * 1 4 5 3 2
         */
    }

    static void Quick(Integer arr[]) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
