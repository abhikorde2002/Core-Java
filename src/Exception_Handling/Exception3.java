package Exception_Handling;

public class Exception3 {
    public static void main(String[] args) {
        String s= "Pentagon space";
        s=null;
        
        try{System.out.println(s.length());   
        }
        catch(Exception e){
            System.out.println("Null poin exception ");
        }
        //NullPointerException: Cannot invoke "String.length()" because "s" is null
    }
}
