package Bit_Manipulation;

public class ClearIBits {
    public static void main(String[] args) {
        System.out.println(clearI(6, 2, 7));
    }

    static int clearI(int n, int i, int j) {
        int a = ((~0) << (j + 1));
        int b = (1 << i) - 1;
        int bitMask = a | b;
        return n & bitMask;
    }
}
