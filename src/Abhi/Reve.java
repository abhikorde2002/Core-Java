package Abhi;

public class Reve {
    public static void main(String[] args) {
          Reve reve = new Reve();
        System.out.println(  reve.reverse(-123));
    }

    static final int MAX = Integer.MAX_VALUE / 10;

    public int reverse(int x) {
        int sign = 1;
        if (x < 0) {
            x = -x;
            sign = -1;
        }
        int ret = 0;
        while (x > 0) {
            ret = ret * 10 + x % 10;
            x = x / 10;
            if (ret > MAX && x > 0) {
                return 0;
            }
        }
        return ret * sign;
    }
}
