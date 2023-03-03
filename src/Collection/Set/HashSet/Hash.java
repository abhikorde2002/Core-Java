package Collection.Set.HashSet;

import java.util.ArrayList;
import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {
        HashSet h = new HashSet<>();
        h.add("Java");
        h.add("Php");
        h.add(".Net");
        h.add(null);
        h.add("c");
        h.add("Java");

        System.out.println(h);
    }
}
