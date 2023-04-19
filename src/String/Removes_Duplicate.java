package String;

import java.util.Currency;

public class Removes_Duplicate {
    public static void main(String[] args) {
        String str="apppnacolllege";
        removeDuplicate(str, 0, new StringBuilder(""), new boolean[26] );
    }

    static void removeDuplicate(String str,int ind,StringBuilder newStr,boolean map[]){
        if(ind == str.length()){
            System.out.println(newStr);
            return;
        }
        char cha = str.charAt(ind);
        if(map[cha - 'a']== true){
            removeDuplicate(str, ind+1, newStr, map);
        }
        else{
            map[cha -'a']=true;
            removeDuplicate(str, ind+1, newStr.append(cha), map);
        }
    }
}
