package Practice_Quesion.String;
//Find the special character, uppercase, lowercase, Number of digits in the given string
public class Find_Spe_Cha {
    public static void main(String[] args) {
        print("Abhishekkorde@44Gmail.Com");
    }   
    static void print(String str){
        String str1="";
        int Ulcount=0;
        int lower=0;
        int special=0;
        int num=0;

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isLetter(ch)){
                if(Character.isUpperCase(ch)){
                    Ulcount++;
                }
                else if(Character.isLowerCase(ch)){
                   lower++;
                }
            }
            else if(Character.isDigit(ch)){
                num++;
            }
            else {
                special++;
            }
        }
        System.out.println(Ulcount+ " "+lower+ " " +num+" "+special);
    } 
}
