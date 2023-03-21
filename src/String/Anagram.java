package String;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str="Listen";
        String str2="Silent";

        char s[]={'g','r','a','m'};
        char c[]={'a','r','m','g'};
         
        ana("Race", "Care");
       System.out.println( anagram(s, c));

        //  boolean isAnagram=false;
        // for(int i=0;i<str.length();i++){
        //    for(int j=i+1;j<str.length();j++){
        //      char ch=Character.toLowerCase(str.charAt(i));
        //      char ch1=Character.toLowerCase(str.charAt(j));
             
        //      if(ch==ch1){
        //         isAnagram=true;
        //      }
        //      else{
        //         isAnagram=false;
        //      }
        //    }
        // }
        // System.out.println((isAnagram==true)?"Anagram" :"Not anagram");
    }

    static boolean anagram(char[] s,char[] c){
      int n=s.length;
      int n1=c.length;

      if(n!=n1)
          return false;

      Arrays.sort(s);
      Arrays.sort(c);
      
      for(int i=0;i<n;i++){
        if(s[i]!=c[i]){
            return false;
        }
        else{
            return true;
        }
      }

      return true;
    }

    static void ana(String strs,String str2){
        strs=strs.toLowerCase();
        str2=str2.toLowerCase();

        if(strs.length()==str2.length()){
            char c[]=strs.toCharArray();
            char s[]=str2.toCharArray();

            Arrays.sort(c);
            Arrays.sort(s);

            boolean res=Arrays.equals(c, s);

            if(res){
                System.out.println(strs + " and "+ str2 +" are anagram");
            }
            else{
                System.out.println(strs + " and " + str2 + " are not anagram.");
            }
        }
        else {
            System.out.println(strs + " and " + str2 + " are not anagram.");
          }
    }
}
