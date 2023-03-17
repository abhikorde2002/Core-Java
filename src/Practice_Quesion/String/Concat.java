package Practice_Quesion.String;
//Assume the string is he,xa,wa,re and give the output as hexaware
public class Concat {
    
    public static void main(String[] args) {
       space("he,xa,wa,re"); 
       spaces("he,xa,wa,re");
    }

    static void space(String str){
        String str1="";

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch!=','){
                str1+=ch;
            }

        }
        System.out.println(str1);
    }

    static void spaces(String str){
       String str1="";
       for(int i=0;i<str.length();i++){
          str1=str.replace(",", "");
          
       }
       System.out.println(str1);
    }
}
