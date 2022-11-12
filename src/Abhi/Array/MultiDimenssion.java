package Abhi.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimenssion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList <ArrayList<Integer>> list = new ArrayList<>();

        //initialisation
        for (int i=0;i< 3;i++) {
            list.add(new ArrayList<>());
        }

        //add element.
        for (int i=0;i< 3;i++){
            for (int j=0;j< 3 ; j++){
                list.get(i).add(scanner.nextInt());
            }
        }
        System.out.println(list);


    }


}
