package TwoD;

public class Transpose {
    public static void main(String[] args) {
        int arr[][] = { { 11, 12, 13 }, { 21, 22, 23 } };
        print(arr);
        transpose(arr);
    }

    static void transpose(int arr[][]) {
        int row = 2, col = 3;

        int newArr[][] = new int[col][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                newArr[j][i] = arr[i][j];
            }
        }
        print(newArr);
    }

    static void print(int arr[][]) {
        System.out.println("The matrix is:- ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    /*
     * The matrix is:-
     * 11 12 13
     * 21 22 23
     * The matrix is:-
     * 11 21
     * 12 22
     * 13 23
     */
}
