package Backtracking;

public class N_Queens {
    public static void main(String[] args) {
        int n = 2;
        char board[][] = new char[n][n];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = 'x';
            }
        }
        nQueen(board, 0);
    }

    static void nQueen(char board[][], int row) {
        // base
        if (row == board.length) {
            printBoard(board);
            return;
        }
        // colum loop
        for (int j = 0; j < board.length; j++) {
            board[row][j] = 'Q';
            nQueen(board, row + 1);// Function call
            board[row][j] = 'x';// backtrackig step
        }

    }

    static void printBoard(char board[][]) {
        System.out.println("------Chess Board ------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
