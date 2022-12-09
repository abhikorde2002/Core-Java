package Recursion_Basic;

public class Power_Optimized {
    public static void main(String[] args) {
        int a = 2;
        int n = 20;
        System.out.println(optimized(a, n));
    }

    static int optimized(int a, int n) {
        if (n == 0) {
            return 1;
        }
        int half_power = optimized(a, n / 2);
        int half_Power = half_power * half_power;
        if (n % 2 != 0) {
            half_Power = a * half_Power;
        }
        return half_Power;
    }
}
