package Practice_Quesion.String;
//How do you remove leading and trailing spaces from a string in Java?
public class Remove_Leading {
    public static void main(String[] args) {
       remove("     Hello World "); 
    }

    static void remove(String str){
        String str1="";
        str1 +=str.trim();
        System.out.println(str1);
    }
}
