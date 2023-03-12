package String;

public class Convert {
    public static void main(String[] args) {
        String str = new String("hi, i am abhishek ");
        System.out.println(toUpper(str));
        letters(str);
    }

    static String toUpper(String str) {
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    static void letters(String str){
        String str1="";
        
        char ch=Character.toUpperCase(str.charAt(0));
        str1+=ch;

        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' ' && i< str.length()-1){
               str1+=str.charAt(i);
               i++;
               str1+=Character.toUpperCase(str.charAt(i));
            }
            else{
                str1+=str.charAt(i);
            }

        }
        System.out.println(str1);
    }
}
