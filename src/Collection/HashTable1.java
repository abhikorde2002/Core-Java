package Collection;

import java.util.Hashtable;

public class HashTable1 {
    public static void main(String[] args) {
        Hashtable t = new Hashtable<>();
        t.put(5,"Dell");
        t.put(10,"Mac book Air ");
        t.put(8, "HP paveliun");
        t.put(2, "Asuc");
        System.out.println(t);
        //{10=Mac book Air , 8=HP paveliun, 5=Dell, 2=Asuc}
    }
}
