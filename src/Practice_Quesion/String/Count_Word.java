package Practice_Quesion.String;
//Count of each Word Program
public class Count_Word {
    public static void main(String[] args) {
        Words("One Two Three Four");
    }

    static void Words(String str){
        String words = "";
    int countWords = str.split("\\s").length;
    System.out.println(countWords);
    }
}
