package TwoD;

import java.util.Scanner;

public class Searchinelement {
    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        int key = 5;
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
        // Print 2D array.
        boolean Keyfound = false;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == key) {
                    System.out.println("Key Found at inder :- (" + row + "," + col + ")");
                    Keyfound = true;
                }
            }
            System.out.println();
        }
        if (Keyfound == false) {
            System.out.println("Key not found");
        }

        // Largest
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (max < arr[row][col]) {
                    max = arr[row][col];
                }
            }
            System.out.println();
        }
        System.out.println(max);

    }
}
