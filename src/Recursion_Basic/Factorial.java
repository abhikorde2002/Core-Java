package Recursion_Basic;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(fact(5));
    }

    static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        int fn = fact(n - 1);
        int f = n * fn;
        return f;
    }
}
