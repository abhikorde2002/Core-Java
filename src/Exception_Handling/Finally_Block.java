package Exception_Handling;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class Finally_Block {
    public static void main(String[] args) {
        try{
            int a[]= new int[5];
            a[23]=21;
            String s= null;
            System.out.println(s.length());
            // Connection c;
            // DriverManager dm;
            // Statement s;
        }
        catch(ArrayIndexOutOfBoundsException e ){
            System.out.println("ArrayIndexOut of bound exception");
        }
        catch(NullPointerException e){
            System.out.println("NullPointerException Exception");
        }
        catch (Exception e){
            System.out.println("Exception ");
        }
        finally{
            System.out.println("Final block");
        }
    }
}
