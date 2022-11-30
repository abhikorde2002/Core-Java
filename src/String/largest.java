package String;

public class largest {
    public static void main(String[] args) {
        String str[] = { "mango", "apple", "banana" };
        compare(str);
    }

    static void compare(String arr[]) {
        String large = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (large.compareTo(arr[i]) < 0) {
                large = arr[i];
            }
        }
        System.out.println(large);
    }
}
