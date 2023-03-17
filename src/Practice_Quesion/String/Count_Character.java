package Practice_Quesion.String;

public class Count_Character {
    public static void main(String[] args) {
        counts("Abhi");
    }
    static void counts(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
           char ch = str.charAt(i);
           count++;
        }
        System.out.println(count);
    }
}
