package Practice_Quesion.Array;

public class Rev {
    public static void main(String[] args) {
        Rev r= new Rev();
        r.rev("Abhi");
        r.max(5, 10, 3);
    }

     void rev(String str){
        String str1="";

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            str1=ch+str1; 
        }
        System.out.println(str1);
     }

     void max(int a,int b,int c){
        int maximum=Math.max(Math.max(a, b),c);
        int min= Math.min(Math.min(a, b),c);

        System.out.println("Maximum value among "+ a+  " "+ b+ " "+c + " is :- " +maximum) ;
        System.out.println("Minimum value among "+ a + " "+ b+ " "+c + " is :- " +min) ;
     }
}
