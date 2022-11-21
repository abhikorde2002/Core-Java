package Search;

public class j {
    public static void main(String[] args) {

        int a = 10;
        System.out.println(a-- * a--);
        int meal = 5;
        int tip = 2;
        int total = meal + (meal > 6 ? ++tip : --tip);
        System.out.println(total);
        if (1 + 1 + 1 + 1 + 1 == 5) {
            System.out.println(true);
        }
        int b = a++;
        System.out.println(b);
        int z = 10, x = 3, y = 5;
        System.out.println(++z + y - y + z + x++);

        for (int i = 1; i < 6; i++) {
            if (i > 3) {
                continue;
            }
            System.out.println(i);
        }
    }
}
