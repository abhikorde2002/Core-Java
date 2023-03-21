package Practice_Quesion.String;

public class Remove_Vowels {
    public static void main(String[] args) {
        remove_vow("Abhishek");
    }

    static void remove_vow(String str){
        String s="";
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if((ch=='A')|| (ch=='E') || (ch=='I') || (ch=='O') || (ch=='U') || (ch=='a') || (ch=='e') || (ch=='i') || (ch=='o') || (ch=='u')){
             count++;
             s=s+"";
            }
        
        if(count>=2){
            s=s+str.charAt(i);
        }
      
    }
        System.out.println(s);
    }
}
/*
write a program that will take one string as input the program will then remove vowels a, e, i, o, from the string if there are two or more than two vowels that occur together then the program shall ignore all of those vowels
 */