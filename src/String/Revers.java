package String;

public class Revers {
    public static void main(String[] args) {
        rev("Hello");
    }

    static void rev(String str) {
        System.out.println("Original String" + str);

        String n = " ";
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            n = ch + n;
        }
        System.out.println("Revers String is :- " + n);
    }

}
