package Abhi.practiceQuesion.Array.Insert;

import java.util.Arrays;
import java.util.Scanner;

public class Arrayprint {
    public static void main(String[] args) {
        int arr[] = new int[3];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the array element:- ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        // First way to Print array.
        System.out.println(Arrays.toString(arr));

        // Second way to print array.
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        // 3 way to print array
        for (int a : arr) {
            System.out.println(a);
        }
    }
}
