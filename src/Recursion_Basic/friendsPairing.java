package Recursion_Basic;

public class friendsPairing {
    public static void main(String[] args) {
        System.out.println(friend(4));
    }

    static int friend(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        // // choice single
        // int fnm1 = friend(n - 1);

        // // pair
        // int fnm2 = friend(n - 2);
        // int pairways = (n - 1) * fnm2;

        // // total
        // int totalway = fnm1 + pairways;
        // return totalway;
        return friend(n - 1) + (n - 1) * friend(n - 2);
    }
}
