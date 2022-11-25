package TwoD;

import java.util.Scanner;

public class Creating2D {
    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        creat(arr);

    }

    static void creat(int arr[][]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the row limite:- ");
        int n = scanner.nextInt();
        System.out.println("Enter the 2D array :- ");
        // int m=scanner.nextInt();
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = scanner.nextInt();
            }
        }
        print(arr, n);

    }

    static void print(int arr[][], int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
