import java.util.Scanner;

public class PalindromString {
    public static void main(String[] args) {
        // System.out.println("Enter the String:-");
        // Scanner sc = new Scanner(System.in);
        String str = "wow";
        // String s1 = " ";
        // boolean ans = false;
        // for (int i = str.length() - 1; i >= 0; i--) {
        // char ch = str.charAt(i);
        // s1 = s1 + ch;
        // }
        // if (str.equals(s1)) {
        // ans = true;
        // } else {
        // System.out.println("Not Palindrom");
        // }
        System.out.println(isPalindrome(str));

    }

    public static boolean isPalindrome(String str) {
        // Initializing an empty string to store the reverse
        // of the original str
        String rev = "";

        // Initializing a new boolean variable for the
        // answer
        boolean ans = false;

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        // Checking if both the strings are equal
        if (str.equals(rev)) {
            ans = true;
        }
        return ans;
    }
}
