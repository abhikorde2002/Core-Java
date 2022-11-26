package TwoD;

public class Spiral {
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8, },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        spiral_Matrix(arr);
    }

    static void spiral_Matrix(int arr[][]) {
        int startrow = 0;
        int StartCol = 0;
        int endrow = arr.length - 1;
        int endCol = arr[0].length - 1;

        while (startrow <= endrow && StartCol <= endCol) {
            // top
            for (int j = StartCol; j <= endCol; j++) {
                System.out.print(arr[startrow][j] + " ");
            }

            // right
            for (int i = startrow + 1; i <= endrow; i++) {
                System.out.print(arr[i][endCol] + " ");
            }

            // bottom
            for (int j = endCol - 1; j >= StartCol; j--) {
                if (startrow == endrow) {
                    break;
                }
                System.out.print(arr[endrow][j] + " ");
            }

            // left
            for (int i = endrow - 1; i >= startrow + 1; i--) {
                if (StartCol == endCol) {
                    break;
                }
                System.out.print(arr[i][StartCol] + " ");
            }
            startrow++;
            StartCol++;
            endCol--;
            endrow--;

        }
        System.out.println();
    }
}
