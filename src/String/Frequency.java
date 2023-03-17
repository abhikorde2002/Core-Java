package String;
//Frequency of caracter
import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int count[]=new int[256];
        String str=sc.nextLine();

        for(int i=0;i<str.length();i++){
            count[((int) str.charAt(i))]++;
        }

        for(int i=0;i<256;i++){
            if(count[i]!=0){
                System.out.println((char)i+": "+count[i]);
            }
        }
    }
}
