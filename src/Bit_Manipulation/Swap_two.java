package Bit_Manipulation;

//Swaping Two number without Third Variable
public class Swap_two {
    public static void main(String[] args) {
        swap(3, 4);
    }

    static void swap(int a, int b) {
        System.out.println("Before swap : a = " + a + " and b= " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After swap: a =" + a + " and b =" + b);
    }
}
