package Practice_Quesion.String;

public class Rem_Vowels {
    public static void main(String[] args) {
        remove("Abhishek Korde");
        remove1("Jack the rider");
    }
    static void remove(String s){
        // String str2="";  
        //  str2=str.replaceAll( "aeuioAEUIO","" );
        //  System.out.println(str2); 
        
        String s1 = "";
        s1 = s.replaceAll("[aeiou]", ""); 
        System.out.println("String after removing vowel : "+s1); 
    }

    static void remove1(String s){
        String res="";
        
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='a'||s.charAt(i)=='A'){
            res=res+"";
            }
            else if(s.charAt(i)=='e'||s.charAt(i)=='E'){
            res=res+"";
            }
            else if(s.charAt(i)=='i'||s.charAt(i)=='I'){
            res=res+"";
            }
            else if(s.charAt(i)=='o'||s.charAt(i)=='O'){
            res=res+"";
            }
            else if(s.charAt(i)=='u'||s.charAt(i)=='U'){
            res=res+"";
            }
            else{
            res=res+s.charAt(i);
            }
            }
            System.out.println(res);
    }
}
