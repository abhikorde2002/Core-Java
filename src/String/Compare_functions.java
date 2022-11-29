package String;

public class Compare_functions {
    public static void main(String[] args) {
        String s1 = "Abhi";
        String s2 = "Abhi";
        String s3 = new String("Abhi");
        if (s1 == s2) {
            System.out.println("Strings are Equals");
        } else {
            System.out.println("not equal");
        }
        if (s1 == s3) {
            System.out.println("Equal");
        } else {
            System.out.println("not equal");
        }

    }

}
