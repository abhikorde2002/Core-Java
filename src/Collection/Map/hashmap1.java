package Collection.Map;

import java.util.HashMap;
import java.util.Set;

public class hashmap1 {
    public static void main(String[] args) {
        HashMap h= new HashMap();
        h.put(100, 20);
        h.put("jack", "Scoler");
        h.put(200, null);
        h.put(300, "orang");
        h.put(500,"beries");
        h.put(500, "orang");
        
        System.out.println( h.put(600, "hello"));//null
        System.out.println( h.put(600, "hello world"));//hello
        System.out.println(h);//order not preserved

        HashMap h1= new HashMap();
        h1.put(101,"Java");
        h1.put(103, "C");
        h1.putAll(h);
        System.out.println(h1);//order not prserved
        //{100=20, 500=orang, 101=Java, 103=C, 200=null, 600=hello world, 300=orang, jack=Scoler}
        System.out.println(h1.get(102));//null if key not exist

        System.out.println(h1.get(103));//C
        System.out.println(h1.remove(103));//c
        System.out.println(h1.containsKey(101));//true

        System.out.println(h1.containsValue("orang"));//true

        System.out.println(h1.isEmpty());//false
        System.out.println(h1.size());//7
       // h1.clear();
       // System.out.println(h1);{}
       Set s= h1.keySet();
       System.out.println(s);
       //[100, 500, 101, 200, 600, 300, jack]
       System.out.println(h1.values());//[values,values]
       System.out.println(h1.entrySet());//[key=values,key=value]
       System.out.println(h1);
       

    }
}
