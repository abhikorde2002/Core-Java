package Arraylist;

import java.util.ArrayList;

public class Basic {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // Adding element
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        list.add(34);
        System.out.println(list);

        // Get Element
        int element = list.get(2);
        System.out.println(element);

        // remove
        list.remove(2);
        System.out.println(list);

        // set Element at Index
        list.set(2, 3);
        System.out.println(list);

        // containt
        System.out.println(list.contains(2));
        System.out.println(list.contains(44));
    }
}
