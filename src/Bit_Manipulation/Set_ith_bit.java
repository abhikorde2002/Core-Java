package Bit_Manipulation;

import classcomponent.Methodes.staticMethodes;

public class Set_ith_bit {
    public static void main(String[] args) {
        System.out.println(setIth(10, 2));
    }

    static int setIth(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }
}
