package Practice_Quesion.String;

public class Duplicate_Count {
    public static void main(String[] args) {
        Count("Abhishek korde");
    }

    static void Count(String str){
        int count=0;
        String str1="";

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            for(int j=i+1;j<str.length()-1;j++){
                if(str.charAt(i)!=str.charAt(j)){
                    str1+=ch;
                }
                else{
                    count++;
                }
            }
        }
        System.out.println(str1);
        System.out.println("Duplicate count is : -" +count);
    }
}
