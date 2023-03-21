package Practice_Quesion.String;

public class Count {
    public static void main(String[] args) {
        counts("Abhishek Korde@!@#34");
    }

    static void counts(String str){
        int Upper=0;
        int Lower=0;
        int digits=0;
        int special=0;

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isLetter(ch)){
                if(Character.isLowerCase(ch)){
                    Lower++;
                }
                else {
                    Upper++;
                }
            }
           else if(Character.isDigit(ch)){
            digits++;
           }
           else{
            special++;
           }
        }
        System.out.println("Lower case count:- "+ Lower + " Upper case :- "+Upper);
        System.out.println("Digits count:- "+digits + " Special character count :- " +special);
    }
}
