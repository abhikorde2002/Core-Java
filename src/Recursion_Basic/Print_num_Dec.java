package Recursion_Basic;

public class Print_num_Dec {
    public static void main(String[] args) {
        print(10);
    }

    static void print(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print(n - 1);
    }
}
