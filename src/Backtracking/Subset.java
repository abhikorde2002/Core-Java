package Backtracking;

public class Subset {
    public static void main(String[] args) {
        String str = "abc";
        findSubset(str, " ", 0);
    }

    static void findSubset(String str, String ans, int i) {
        // base case
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;
        }
        // Yes choise
        findSubset(str, ans + str.charAt(i), i + 1);

        // No choise
        findSubset(str, ans, i + 1);
    }
}
