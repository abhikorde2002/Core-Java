package Practice_Quesion;

import javax.swing.SortOrder;

public class Palindrom_Range {
    public static void main(String[] args) {
       int n=1000;
       for(int i=10;i<n;i++){
        if(range(i)){
            System.out.println(i);
        }
       }
    }

    static boolean range(int num){
        int ori=num;
        int rev=0;
        while(num>0){
            int digit=num%10;
            rev= (rev*10)+digit;
            num=num/10;
        }
        // System.out.println((ori==rev)? "Palindrom" : "Not Palindrom");
        if(ori==rev){
            return true;
        }
        return false;
    }
}
