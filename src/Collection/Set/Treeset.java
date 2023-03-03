package Collection.Set;

import java.util.Comparator;
import java.util.TreeSet;

public class Treeset {
    public static void main(String[] args) {
        TreeSet t = new TreeSet(new Mycapmpartor());
        t.add("mango");
        t.add("apple");
        t.add("orange");
        t.add("mango");
        t.add("straberries");
        // try{
        //     t.add(200);
        // }
        // catch(Exception e){
        //     System.out.println("class Cast Exception");
        // }
        System.out.println(t);
    }
}
class Mycapmpartor implements Comparator{
    public int compare(Object obj1,Object obj2){
        String a=(String)obj1;
        String b=(String)obj2;
        // return a.compareTo(b);[apple, mango, orange, straberries]
        // return -(a.compareTo(b));[straberries, orange, mango, apple]
        return 1;
    }
}
