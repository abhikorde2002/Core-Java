package Arraylist;

import java.util.ArrayList;

public class Cotainer {
    public static void main(String[] args) {
        ArrayList<Integer> hight = new ArrayList<>();
        // 1, , 6, 2 , 5 , 4 , 8 , 3 , 7
        hight.add(1);
        hight.add(8);
        hight.add(6);
        hight.add(2);
        hight.add(5);
        hight.add(4);
        hight.add(8);
        hight.add(3);
        hight.add(7);
        storeWater(hight);

    }

    // static int storeWater(ArrayList<Integer> hight) {
    // int maxWater = 0;
    // //Brute Force
    // for (int i = 0; i < hight.size(); i++) {
    // for (int j = i + 1; j < hight.size(); j++) {
    // int ht = Math.min(hight.get(i), hight.get(j));
    // int width = j - i;
    // int currWater = ht * width;
    // maxWater = Math.max(maxWater, currWater);
    // }
    // }
    // return maxWater;
    // }

    static void storeWater(ArrayList<Integer> height) {
        // Calculate water area
        int maxWater = 0;
        int lp = 0;
        int rp = height.size() - 1;

        while (lp < rp) {
            // Calculate water area
            int ht = Math.min(height.get(lp), height.get(rp));
            int width = rp - lp;
            int currWater = ht * width;
            maxWater = Math.max(maxWater, currWater);

            // Update ptr
            if (height.get(lp) < height.get(rp)) {
                lp++;
            } else {
                rp--;
            }
        }
        System.out.println(maxWater);
    }
}
