package Practice_Quesion.String;
//How do you check whether a string is a palindrome in Java?
public class String_Palindrom {
    public static void main(String[] args) {
        System.out.println(palindrom("wow"));

        System.out.println(palindroms("wow"));
    }

    static boolean palindrom(String str){
        boolean isPrime= false;

        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)==str.charAt(str.length()-1-i)){
                isPrime= true;
            }
        }
        return isPrime;
    }

    static boolean palindroms(String str){
           String str1="";

           for(int i=0;i<str.length();i++){
            str1= str.charAt(i)+str1;
           }
           if(str.equals(str1)){
            return true;
           }

           return false;
    }

    static void pali(String str){
        String newStr="";
       
        int i=str.length()-1;
        while(i>=0){
            char ch=str.charAt(i);
            newStr =(String)(newStr+ch);
            i--;
        }
        System.out.println(newStr);
     
        if(str.equals(newStr)){
            System.out.println("Palindrom");
        }
        else{
            System.out.println("Not Palindrom ");
        }
    }
}
