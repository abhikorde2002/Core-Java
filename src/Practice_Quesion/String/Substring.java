package Practice_Quesion.String;
//Write a Program to print all substrings of a given string
public class Substring {
    public static void main(String[] args) {
        SubString("Abhishek");
        sub("String ");
    }

    static void SubString(String str){
        char ch[]=str.toCharArray();

        for(int i=0;i<str.length();i++){
            int start=i;
            for(int j=i;j<str.length();j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(ch[k]+" ");
                }
                System.out.println();
            }
        }
    }

    static void sub(String str){
        char ch[]=str.toCharArray();
        
        for(int i=0;i<str.length();i++){
            int st=i;
            for(int j=i;j<str.length();j++){
                int end=j;
                for(int k=st;k<=end;k++){
                    System.out.print(ch[k]+" ");
                }
                System.out.println();
            }
        }

    }
}
