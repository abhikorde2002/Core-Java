package Collection.Set;

import java.util.PriorityQueue;

public class Priority {
    public static void main(String[] args) {
        PriorityQueue p= new PriorityQueue();
        p.offer("Orange");
        p.offer("Apple");
        p.offer("Banana");
        p.offer("Papaya");
        p.offer("grapees");
//certian os does not support for priority Queues
        System.out.println(p);
    }
}
