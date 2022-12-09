package Recursion_Basic;

public class Binary_String {
    public static void main(String[] args) {
        print(3, 0, "");
    }

    static void print(int n, int lastplace, String str) {
        // base case
        if (n == 0) {
            System.out.println(str);
            return;
        }
        // work
        print(n - 1, 0, str + "0");
        if (lastplace == 0) {
            print(n - 1, 1, str + "1");
        }

    }
}
