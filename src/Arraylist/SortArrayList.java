package Arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SortArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(1);
        list.add(3);
        list.add(5);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        // Descending
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}
