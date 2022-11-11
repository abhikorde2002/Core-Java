package Kunal.Array.Linearsearch;

import java.util.Arrays;

public class searchString {
    public static void main(String[] args) {
        String name="I AM abhi";
        char key='i';
        System.out.println(sea(name,key));
        System.out.println(Arrays.toString(name.toCharArray()));
    }

    static boolean sea1(String name,char key){
        if (name.length()==0){
            return false;
        }
        for (char ch:name.toCharArray()){
            if (ch==key){
                return true;
            }
        }
        return false;
    }
    static boolean sea(String name,char key){
        if (name.length()==0){
            return false;
        }
        for (int i=0;i<name.length();i++){
            if (key==name.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
