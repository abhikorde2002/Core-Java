package Abhi.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Initialisation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[5];
        arr[0] = 11;
        arr[1] = 22;
        arr[2] = 12;
        arr[3] = 25;
        arr[4] = 543;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
        for (int num : arr) { // for every element in array print the element
            System.out.print(num + " ");// here num simply print all element from array.
        }

        // array of object.
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = scanner.next();
        }
        System.out.println(Arrays.toString(str));
    }
}
