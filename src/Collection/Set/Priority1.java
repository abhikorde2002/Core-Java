package Collection.Set;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Priority1 {
    public static void main(String[] args) {
        PriorityQueue p = new PriorityQueue(new Mycapmpartor());
        p.offer("Orange");
        p.offer("Apple");
        p.offer("Banana");
        p.offer("Papaya");
        p.offer("grapes");
        System.out.println(p);
    }
}
class Mycapmpartors implements Comparator{
    public int compare(Object obj1,Object obj2){
        String s= (String)obj1;
        String s1=(String)obj2;
        return-(s.compareTo(s1));

    }
}