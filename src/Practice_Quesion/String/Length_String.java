package Practice_Quesion.String;
// Program to find the length of a string without using In-built functions with dynamic inputs
public class Length_String {
    public static void main(String[] args) {
        counts("Abhishek");
    }

    static void counts(String str){
        int count=0;
        for(char ch:str.toCharArray()){
           count++;
        }
    System.out.println("Length of String is :- "  +count);
    }

}
