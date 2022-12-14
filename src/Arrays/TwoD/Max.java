package TwoD;

import java.util.Scanner;

class Max {
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

        int max = Integer.MIN_VALUE;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (max < arr[row][col]) {
                    max = arr[row][col];
                }
            }
            System.out.println();
        }
        System.out.println("Max Value in 2D Array :-" + max);

    }
}