package Practice_Quesion.String;

public class Remove_space {
    public static void main(String[] args) {
        remove(" Hello I am Abhi shek");
        remove_Space(" Hello I am Abhi shek");
    }

    static void remove(String str){
        String str1="";

        for(int i=0;i<str.length();i++){
            str1 =str.replace(" ", "");
        }
        System.out.println(str1);
    }

    static void remove_Space(String str){
        String str1="";
        
        for(int i=0;i<str.length();i++){
           char ch=str.charAt(i);
           if(ch!=' '){
             str1+=ch;
           }
        }
        System.out.println(str1);
    }
}
