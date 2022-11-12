package Abhi.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 //       System.out.println("Enter the number :- " );
        //int num=scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>(10);
//        list.add(20);
//        list.add(30);
//        list.add(30);
//        list.add(301);
//        list.add(303);
//        list.add(303);
//        list.add(330);
//        list.set(2,55);
//        list.remove(5);
//        System.out.println(list.contains(303));
//        System.out.println(list);

          for (int i=0;i< 5;i++) {
            list.add(scanner.nextInt());
          }

          for (int i=0;i< 5;i++){
              System.out.println(list.get(i));//pass index here ,list[index]
          }
                  System.out.println(list);



    }



}
