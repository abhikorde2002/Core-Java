package Collection.LinkedList;

import java.util.LinkedList;

public class Methods {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add("Java");
        linkedList.add("Python");
        linkedList.add("C");
        linkedList.add("R");
        linkedList.add("Javascript");
        System.out.println(linkedList);   
        
        LinkedList l = new LinkedList<>();
        l.add("Pen");
        l.add("Black");

        l.addAll(linkedList);
        System.out.println(l);

        l.retainAll(linkedList);
        System.out.println(l);
        System.out.println(l.contains("C"));
        System.out.println(l.containsAll(linkedList));
        System.out.println(l.isEmpty());

        System.out.println(l.set(3, "Pencil"));
        System.out.println(l.indexOf("Pencil"));
        System.out.println(l);

        l.addFirst("Carrot");
        l.addLast("Coke");
        System.out.println(l);
        System.out.println(l.getFirst());
        System.out.println(l.getLast());
        System.out.println(l.removeFirst());
        System.out.println(l.removeLast());
        System.out.println(l);
    }
}
