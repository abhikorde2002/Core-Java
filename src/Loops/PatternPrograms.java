public class PatternPrograms {
    public static void main(String[] args) {
        Pattern3_2(6);
    }

    static void Pattern1(int n) {

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();

//        *
//        * *
//        * * *
//        * * * *
//        * * * * *
//        * * * * * *
        }
    }

    static void Pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();

//            * * * * * *
//            * * * * *
//            * * * *
//            * * *
//            * *
//            *
        }
    }

    static void Pattern2_1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = n; col >= row; col--) {
                System.out.print("* ");
            }
            System.out.println();

//            * * * * * *
//            * * * * *
//            * * * *
//            * * *
//            * *
//            *
        }
    }

    static void Pattern3(int n) {
        int row, col;
        for (row = 1; row <= n; row++) {
            for (col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (row = 1; row < n; row++) {
            for (col = 1; col < n - row + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();

//            *
//            * *
//            * * *
//            * * * *
//            * * * * *
//            * * * * * *
//            * * * * *
//            * * * *
//            * * *
//            * *
//            *
        }
    }

    static void Pattern3_1(int n) {
        int row, col;
        for (row = 1; row <= n; row++) {
            for (col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (row = 1; row < n; row++) {
            for (col = n; col > row; col--) {
                System.out.print("* ");
            }
            System.out.println();

//            *
//            * *
//            * * *
//            * * * *
//            * * * * *
//            * * * * * *
//            * * * * *
//            * * * *
//            * * *
//            * *
//            *
        }
    }

    static void Pattern3_2(int n) {

        for (int row = 1; row <= n * 2 - 1; row++) {
            int TotalNumberOfCol = row > n ? 2 * n - row : row;
            for (int col = 1; col <= TotalNumberOfCol; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }


//            *
//            * *
//            * * *
//            * * * *
//            * * * * *
//            * * * * * *
//            * * * * *
//            * * * *
//            * * *
//            * *
//            *
    }
}




