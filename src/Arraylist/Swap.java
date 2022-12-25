package Arraylist;

import java.util.ArrayList;

public class Swap {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(6);
        list.add(4);
        list.add(5);

        int index = 1, index1 = 3;
        System.out.println(list);
        swap(list, index, index1);
        System.out.println(list);

        // rev(list);
        // System.out.println(list);

    }

    // static void rev(ArrayList<Integer> list) {
    // int start = 0;
    // int end = list.size() - 1;

    // while (start < end) {
    // swap(list, start, end);
    // start++;
    // end--;
    // }

    // }

    static void swap(ArrayList<Integer> list, int index, int index1) {
        int tem = list.get(index);
        list.set(index, list.get(index1));
        list.set(index1, tem);
    }

}
