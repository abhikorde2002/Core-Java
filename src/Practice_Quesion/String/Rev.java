package Practice_Quesion.String;

import java.util.Scanner;

public class Rev {
    public static void main(String[] args) {
       rev("Abhi Korde");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Original string : ");
    
        String originalStr = scanner.nextLine();
        String reversedString = "";
        int start = 0;
        int end;
    
        while ((end = originalStr.indexOf(' ', start)) >= 0) {
            
          for (int i = end - 1; i >= start; i--) {
            reversedString += originalStr.charAt(i);
          }
          reversedString += 5;
          start = end + 1;
        }
    
        for (int i = originalStr.length() - 1; i >= start; i--) {
          reversedString += originalStr.charAt(i);  
        }
    
        // Displaying the string after reverse
        System.out.print("Reversed string : " + reversedString);
      }
    static void rev(String str){
        String str1="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch!=' '){
               
                    str1=ch+str1;
                
            }
            else{
                str1=str1+"";
               }
        }
        System.out.println(str1);
    }
}
