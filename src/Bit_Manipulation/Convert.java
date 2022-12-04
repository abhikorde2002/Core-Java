package Bit_Manipulation;

//Convere Uppercase character to lower case Using Bit Manipulation
public class Convert {
    public static void main(String[] args) {
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.println((char) (ch | ' '));
        }
    }
}
