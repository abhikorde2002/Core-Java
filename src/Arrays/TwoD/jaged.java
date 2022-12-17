package TwoD;

// import java.util.Arrays;
import java.util.Scanner;

public class jaged {
    public static void main(String[] args) {
        int arr[][] = new int[3][];
        arr[0] = new int[4];
        arr[1] = new int[3];
        arr[2] = new int[2];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the values:- ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        // for (int[] a : arr) {
        // System.out.println(Arrays.toString(a));
        // }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
