public class ReversString {
    public static void main(String[] args) {
        rev1("Hello");
    }// By using Reverse iteration

    static void rev(String str) {
        String str1 = "";
        for (int i = str.length() - 1; i > 0; i--) {
            str1 += str.charAt(i);
        }
    }

    static void rev1(String str) {
        StringBuilder s = new StringBuilder(str);
        s.reverse();
        System.out.println(s.toString());
    }
}
