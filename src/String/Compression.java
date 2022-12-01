package String;

public class Compression {
    public static void main(String[] args) {
        String str = "aaabbcccdd";
        System.out.println(Compare(str));
        System.out.println(builder(str));
    }

    static String Compare(String str) {
        // Using String
        String ch = "";
        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;

            }
            ch += str.charAt(i);
            // System.out.println((count > 1) ? count : ch);
            if (count > 1) {
                ch += count.toString();
            }
        }
        return ch;
        // System.out.println(ch);
    }

    static String builder(String str) {
        StringBuilder newstr = new StringBuilder("");

        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;

            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            newstr = newstr.append(str.charAt(i));
            if (count > 1) {
                newstr = newstr.append(count.toString());
            }
        }
        return newstr.toString();
    }
}
