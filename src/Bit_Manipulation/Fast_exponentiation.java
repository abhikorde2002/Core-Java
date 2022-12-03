package Bit_Manipulation;

public class Fast_exponentiation {
    public static void main(String[] args) {
        System.out.println(Fast(5, 3));
    }

    static int Fast(int n, int a) {
        int ans = 1;

        while (n > 0) {
            if ((n & 1) != 0) {
                ans = ans * a;
            }
            a = a * a;
            n = n >> 1;
        }
        return ans;
    }

}
