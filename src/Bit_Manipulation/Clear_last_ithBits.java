package Bit_Manipulation;

class Clear_last_ithBits {
    public static void main(String[] args) {
        System.out.println(clearIth(15, 2));
    }

    static int clearIth(int n, int i) {
        int bitMask = (~0) << i;
        return n & bitMask;
    }

}