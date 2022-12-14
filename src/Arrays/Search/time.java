package Search;

public class time {
    public static void main(String[] args) {
        int i, j, k = 0;
        int n = 32;
        for (i = n / 2; i <= n; i++) {
            System.out.println(i);
            for (j = 2; j <= n; j = j * 2) {
                k = k + n / 2;
            }
            System.out.println(k);
        }
    }
}
