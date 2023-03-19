package Practice_Quesion.String;
//Separate reverse of each word in the string Program.
public class Reverse_word {
    public static void main(String[] args) {
       revers("I am The King");
    }

    static void revers(String str1){
        String word[]=str1.split(" ");
        String str="";
        for(int i=0;i<word.length;i++){
            String words=word[i];
             String str2="";
            for(int j=0;j<=words.length()-1;j++){
                str2=" "+words.charAt(j)+str2 ;
            }
            str+=str2+" ";
        }
        System.out.println(str);
    }

    
}
