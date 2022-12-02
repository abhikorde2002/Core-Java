package Bit_Manipulation;

import Abhi.practiceQuesion.recursionPattern;

public class Update {
    public static void main(String[] args) {
        System.out.println(up(10, 2, 1));
    }

    static int up(int n, int i, int newBit) {
        if (newBit == 0) {
            return clear(n, i);
        } else {
            return setIth(n, i);
        }
    }

    static int clear(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    static int setIth(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }
}
