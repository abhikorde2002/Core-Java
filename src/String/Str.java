package String;

import java.util.Scanner;

public class Str {
    public static void main(String[] args) {
        // char ch[] = { 'a', 'b', 'c', 'd' };
        // String str = "abcd";
        // String str1 = new String("jack ");
        // System.out.println(str1);

        // Scanner sc = new Scanner(System.in);
        // String sc1 = sc.nextLine();
        // System.out.println(sc1);

        String full = "Hello";
        System.out.println(full.length());

        // Concatenation
        String first = "Hello";
        String last = "Coder";
        String Full = first + " " + last;
        System.out.println(Full);
        System.out.println(first.charAt(0));

        for (int i = 0; i < Full.length(); i++) {
            System.out.print(Full.charAt(i));
        }
        System.out.println();

    }

}
