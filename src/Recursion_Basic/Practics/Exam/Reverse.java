package Recursion_Basic.Practics.Exam;

import java.util.ArrayList;

public class Reverse {
    public static void main(String[] args) {
        ArrayList<String> word=new ArrayList<>();

        word.add("Hello");
        word.add("Coder");
        word.add("Java");

        for(int i=0;i<word.size();i++){
               String words=word.get(i);
               String reversWord= revers(words);
               word.set(i, reversWord);
        }

        for(String w:word){
            System.out.println(w);
        }
    }

    static String revers(String word){
        StringBuilder s= new StringBuilder();
        for(int i=word.length()-1;i>=0;i--){
            s.append(word.charAt(i));
        }
        return s.toString();
    }
}
