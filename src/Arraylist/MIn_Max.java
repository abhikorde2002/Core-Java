package Arraylist;

import java.util.ArrayList;

public class MIn_Max {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(6);
        list.add(4);
        list.add(5);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < list.size(); i++) {
            max = Math.max(max, list.get(i));

        }
        System.out.println(max);

        for (int i = 0; i < list.size(); i++) {
            min = Math.min(min, list.get(i));

        }
        System.out.println(min);

    }
}
