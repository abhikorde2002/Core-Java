package Bit_Manipulation;

public class IsPower {
    public static void main(String[] args) {
        System.out.println(ispower(15));
    }

    static boolean ispower(int n) {
        return (n & (n - 1)) == 0;
    }
}
