package Exception_Handling;

public class Exception1 {
    public static void main(String[] args) {
        int a[] = new int[5];

        try{
            a[56]=23;
            System.out.println(a[56]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bound exception");
        }
        System.out.println("Main method run normaly");
    }
}
