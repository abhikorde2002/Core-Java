package Bit_Manipulation;

public class BInary_Decimal {
    public static void main(String[] args) {
        bintoDec(11110);
    }

    static void bintoDec(int binNum) {
        int pow = 0;
        int decNum = 0;

        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int) Math.pow(2, pow));

            pow++;
            binNum = binNum / 10;

        }
        System.out.println("Decimal of " + binNum + " =" + decNum);

    }
}
