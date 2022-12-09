package Recursion_Basic;

public class Tiling_problem {
    public static void main(String[] args) {
        System.out.println(tiling(4));
    }

    static int tiling(int n) {
        // Base case
        if (n == 0 || n == 1) {
            return 1;
        }

        // vertical choise
        int flore1 = tiling(n - 1);

        // horizontal choise
        int flore2 = tiling(n - 2);
        int totalways = flore1 + flore2;
        return totalways;
    }
}
