package String;

public class Shortest_Path {
    public static void main(String[] args) {
        String str = "WNEENESENNN";
        System.out.println(shortest(str));
    }

    static float shortest(String str) {
        int x = 0, y = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'W') {
                x--;
            } else if (ch == 'S') {
                y--;
            } else if (ch == 'E') {
                x++;
            } else {
                y++;
            }
        }
        int x1 = x * x;
        int y1 = y * y;
        return (float) Math.sqrt(x1 + y1);
    }
}
