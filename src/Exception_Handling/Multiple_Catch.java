package Exception_Handling;

public class Multiple_Catch {
    public static void main(String[] args) {
        try{
            int a[]= new int[5];
            a[23]=21;
            String s= null;
            System.out.println(s.length());
        }
        catch(ArrayIndexOutOfBoundsException e ){
            System.out.println(e.getMessage());
            System.out.println("ArrayIndexOut of bound exception");
        }
        catch(NullPointerException e){
            System.out.println(e.getMessage());
            System.out.println("NullPointerException Exception");
        }
        catch (Exception e){
            System.out.println("Exception ");
        }
    }
}
