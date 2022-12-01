package Bit_Manipulation;

public class Odd_Even {
    public static void main(String[] args) {
        Odd_Even(16);
    }

    static void Odd_Even(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            System.out.println("Even number ");
        } else {
            System.out.println("Odd number");
        }
    }
}
