package Backtracking;

// Chek if proble can be solve & print only 1 solution to N Queens problem
public class N_Que_1Sol {
    public static void main(String[] args) {
        int n = 6;
        char board[][] = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }
        if (nQueen(board, 0)) {
            System.out.println("Solution is possible:- ");
            printBoard(board);
        } else {
            System.out.println("Solution is not posible");
        }
    }

    static boolean isSafe(char boar[][], int row, int col) {
        // vertical up
        for (int i = row - 1; i >= 0; i--) {
            if (boar[i][col] == 'Q') {
                return false;
            }
        }
        // diag left up
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (boar[i][j] == 'Q') {
                return false;
            }
        }
        // diag right up
        for (int i = row - 1, j = col + 1; i >= 0 && j < boar.length; i--, j++) {
            if (boar[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    static boolean nQueen(char board[][], int row) {
        // base
        if (row == board.length) {
            // printBoard(board);
            return true;
        }
        // colum loop
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                if (nQueen(board, row + 1)) {
                    return true;
                }

                board[row][j] = 'X';
            }
        }
        return false;
    }

    static void printBoard(char board[][]) {
        System.out.println("---- Chess Board ----");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
