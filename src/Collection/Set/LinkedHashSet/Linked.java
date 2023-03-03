package Collection.Set.LinkedHashSet;

import java.util.ArrayList;
import java.util.LinkedList;

public class Linked {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList<>();
        linkedList.add("Java");
        linkedList.add(".net");
         linkedList.add(null);
        linkedList.add("c");
         linkedList.add("Java");
         ArrayList arrayList = new ArrayList<>();
         arrayList.add("Apple");
         arrayList.add("Orange");
         arrayList.addAll(linkedList);
         System.out.println(arrayList);
    }
}
