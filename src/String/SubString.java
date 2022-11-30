package String;

public class SubString {
    public static void main(String[] args) {
        String str = "HelloWorld";
        System.out.println(subString(str, 0, 4));
    }

    static String subString(String str, int start, int end) {
        String sum = "";
        for (int i = start; i < end; i++) {
            sum += str.charAt(i);

        }
        return sum;
    }
}
