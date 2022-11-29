package TwoD;

public class SearchinSorted {
    public static void main(String[] args) {
        int arr[][] = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 } };
        System.out.println(staircase(arr, 33));
    }

    static boolean staircase(int arr[][], int key) {
        int row = 0, col = arr[0].length - 1;

        while (row < arr.length && col >= 0) {
            if (arr[row][col] == key) {
                System.out.println("Key found (" + row + "," + col + ")");
                return true;
            } else if (key < arr[row][col]) {
                col--;
            } else {
                row++;
            }
        }
        System.out.println("Key not found!");
        return false;
    }
}
