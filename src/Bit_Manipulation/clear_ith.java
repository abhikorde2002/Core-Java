package Bit_Manipulation;

public class clear_ith {
    public static void main(String[] args) {
        System.out.println(clear(10, 1));
    }

    static int clear(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }
}
