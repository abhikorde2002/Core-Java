package Bit_Manipulation;

public class SetBits {
    public static void main(String[] args) {
        System.out.println(set(10));
    }

    static int set(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }
}
