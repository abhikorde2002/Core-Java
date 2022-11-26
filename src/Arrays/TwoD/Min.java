package TwoD;

import java.util.Scanner;

public class Min {
    public static void main(String[] args) {
        int arr[][] = new int[3][3];

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

        int min = arr[0][0];
        for (int row = 0; row < n; row++) {

            for (int col = 0; col < arr[row].length; col++) {
                if (min > arr[row][col]) {
                    min = arr[row][col];
                }
            }
            System.out.println();
        }
        System.out.println("Min Value in 2D Array :- " + min);

    }
}
