package Bit_Manipulation;

public class Get_ith_Bit {
    public static void main(String[] args) {
        System.out.println(getIth(5, 2));
    }

    static int getIth(int n, int i) {
        int bitMask = 1 << i;
        if ((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }
}
