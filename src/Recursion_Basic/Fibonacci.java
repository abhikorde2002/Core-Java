package Recursion_Basic;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fib(6));
    }

    static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fn1 = fibonacci(n - 1);
        int fn2 = fn1 + fibonacci(n - 2);
        return fn2;
    }

    static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fn1 = fibonacci(n - 1);
        int fn2 = fibonacci(n - 2);
        return fn1 + fn2;
    }
}
