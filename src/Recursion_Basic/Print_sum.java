package Recursion_Basic;

public class Print_sum {
    public static void main(String[] args) {
        System.out.println(sum(5));
        ;
    }

    static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        int Sumofn = sum(n - 1);
        int Sn = n + Sumofn;
        return Sn;
    }

}
