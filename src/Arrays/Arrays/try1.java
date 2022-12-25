package Arrays;

// import classcomponent.scope;

public class try1 {
    String str = new String("Tree");
    String s2 = str.substring(3);

    public static void main(String[] args) {
        String s1 = "ja";
        String s = "ja";
        System.out.println(s1.equals(s));
        System.out.println(s1 == s);
        StringBuffer str = new StringBuffer("ja");
        System.out.println(s1.equals(str) + " " + str.equals(s1));
    }
}
