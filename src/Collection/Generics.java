package Collection;

import java.util.HashMap;

public class Generics {
    public static void main(String[] args) {
        HashMap <Integer,String> h = new HashMap<Integer,String>();
        h.put(100, "apple");
        h.put(101, "Orange");
        h.put(103, "Papaya");
        // h.put("Hello", "Sir"); Because of no need of type safety 

        h.put(101, null);
        System.out.println(h);
    }
}
