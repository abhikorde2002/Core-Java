package Recursion_Basic;

public class Remove_Duplicate {
    public static void main(String[] args) {
        String str = "appnnacollege";
        rempve(str, 0, new StringBuilder(""), new boolean[26]);

    }

    static void rempve(String str, int idx, StringBuilder newStr, boolean map[]) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        char currCharAt = str.charAt(idx);
        if (map[currCharAt - 'a'] == true) {
            // duplicate
            rempve(str, idx + 1, newStr, map);
        } else {
            map[currCharAt - 'a'] = true;
            rempve(str, idx + 1, newStr.append(currCharAt), map);
        }
    }
}
