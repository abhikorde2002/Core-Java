package Exception_Handling;

public class OutofMemoryError {
    public static void main(String[] args) {
        System.out.println("Entering main");
        try{
            int a[]=new int[999999999]; //Out of memory exception 
            System.out.println("Array created");
        }
        catch (Exception e){
            System.out.println("Array not created");
        }
        finally{
            System.out.println("Finaly block executed");
        }
    }
}
//Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
