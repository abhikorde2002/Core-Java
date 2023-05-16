package Recursion_Basic.Practics.Exam;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Conts {
    public static void main(String[] args) {
        String str="Hello I am Abhishek";
        Map<Character,Integer>  s= new HashMap<>();

        //Cont fre
        for(char c : str.toCharArray()){
            if(Character.isLetter(c)){
                c=Character.toLowerCase(c);
                s.put(c,s.getOrDefault(c,0)+1);
            }
        }
       
        for(Map.Entry<Character, Integer> enter : s.entrySet()){
System.out.println(enter.getKey()+" :" + enter.getValue());
        }
    }


}
