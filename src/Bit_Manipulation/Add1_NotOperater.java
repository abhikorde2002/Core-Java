package Bit_Manipulation;

public class Add1_NotOperater {
    public static void main(String[] args) {
        bit(3, 4, 5);
    }

    static void bit(int a, int b, int c) {
        System.out.println(a + "+" + 1 + " is " + -~a);
        System.out.println(b + "+" + 1 + " is " + -~b);
        System.out.println(c + "+" + 1 + " is " + -~c);
    }

}
