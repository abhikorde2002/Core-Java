package String;

public class Spaces {
    public static void main(String[] args) {
        String str = " hello ,coders I am Abhishek";
        // StringBuilder str1 = new StringBuilder("");

        char ch = '$';
        String newStr = str.replace(' ', ch);
        System.out.println(newStr);
        // for (int i = 0; i < str.length(); i++) {
        // if (str.charAt(i) == ' ' && i <= str.length() - 1) {
        // char ch = str.charAt(i);
        // System.out.print("$");
        // }
        // System.out.print(str.charAt(i));
    }
}
