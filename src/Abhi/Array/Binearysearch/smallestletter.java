package Abhi.Array.Binearysearch;

public class smallestletter {
    public static void main(String[] args) {
        char[] letter={'a','b','c','d'};
        char target='d';
        char ans=GreaterLetter(letter,target);
        System.out.println(ans);
    }
    static char GreaterLetter(char[] letter,char target){
        int start=0;
        int end= letter.length-1;
        while (start <=end){
            int mid=start +(end-start)/2;

            if(target >letter[mid]){
                start=mid+1;
            }
            else if(target<letter[mid]){
                end=mid-1;
            }
        }
        return letter[start% letter.length];
    }
}
