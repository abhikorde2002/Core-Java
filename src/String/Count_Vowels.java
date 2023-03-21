package String;
//Count of vowels and non-vowels Program
public class Count_Vowels {
    public static void main(String[] args) {
        vowels("Abhishek");
    }

    static void vowels(String str){
       //String str1="";
       int countV=0;
       int cha=0;
       for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
        if((ch=='A')|| (ch=='E') || (ch=='I') || (ch=='O') || (ch=='U') || (ch=='a') || (ch=='e') || (ch=='i') || (ch=='o') || (ch=='u')){
          countV++;
        }
        else{
            cha++;
        }
       }
       System.out.println("Count of Vowels are :- " +countV);
       System.out.println("Count of non-vowels:- " +cha);
    }
}
