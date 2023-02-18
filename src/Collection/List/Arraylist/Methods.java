package Collection.Arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        ArrayList a= new ArrayList();

        a.add(0, "Java");
        a.add("Python");
        a.add("C");
        a.add(100);
        System.out.println(a);
       
       ArrayList a1= new ArrayList<>();
       a1.add("apple");
       a1.add("Potato");
       a1.addAll(a);
       System.out.println(a1);
    //    a1.removeAll(a);
    //    System.out.println(a1);
       a1.retainAll(a);
       System.out.println(a1);

       Object arr[]=a.toArray();
       for(Object k :arr){
        System.out.println(k);
       }
    }
}
