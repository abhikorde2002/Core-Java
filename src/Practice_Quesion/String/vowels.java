package Practice_Quesion.String;

public class vowels {
    public static void main(String[] args) {
       vowels("Abhishek"); 
    }
    static void vowels(String str){
        
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if((ch=='A') || (ch=='E') || (ch=='I') || (ch=='O') || (ch=='U') || (ch=='a') || (ch=='e') || (ch=='i') || (ch=='o') || (ch=='u')){
                System.out.println("Vowels "+ch);
            }
        }
    }
}
