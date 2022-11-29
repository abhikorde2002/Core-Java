package String;

public class Palindrome {
    public static void main(String[] args) {
        String str = "noon";
        System.out.println(isPalindrome(str));
    }

    static boolean isPalindrome(String str) {
        int n = str.length();
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

}
