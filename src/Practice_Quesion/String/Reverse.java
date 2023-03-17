package Practice_Quesion.String;

public class Reverse {
    public static void main(String[] args) {
        rev1("Abhi");
    }

    static void rev(String str){
        String str1="";
        for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
        str1=ch+str1;
        }
        System.out.println(str1);
    }

    static void rev1(String str){
        String str1="";
        for(int i=str.length()-1;i>=0;i--){
            char ch=str.charAt(i);
            str1+=ch;
        }
        System.out.println(str1);
    }
}

