package Collection.Map;

import java.util.Comparator;
import java.util.TreeMap;

public class Tree {
    public static void main(String[] args) {
        TreeMap t = new TreeMap(new MyComparator1());
        t.put("Raj",100);
        t.put("AJAY",101);
        t.put("Ram", 102);
        t.put("Abhi", 200);
        System.out.println(t);
    }
}
class MyComparator1 implements Comparator{
    public int compare(Object o1,Object ob2){
        String s= (String) o1;
        String s1= (String)ob2;
        return -(s.compareTo(s1));
    }
}
