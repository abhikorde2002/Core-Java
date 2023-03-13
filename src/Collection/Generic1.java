package Collection;

import java.util.ArrayList;

public class Generic1 {
    public static void main(String[] args) {
        ArrayList <String> a= new ArrayList<String>();
        a.add("Hello");
        a.add("Coder");
        a.add("I Am");

        System.out.println(a);
        String s=a.get(0);
        String d=a.get(1);
        System.out.println(s+" "+d);
    }
}
