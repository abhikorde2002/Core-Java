package classcomponent.Methodes;

public class functionOverloading {
    public static void main(String[] args) {
        System.out.println(sum(2, 11));
        System.out.println(sum(3, 23, 54));

        System.out.println(sum("Abhi", "shek"));
        System.out.println(sum(23.5f, 345.6f));
    }
    
    //Funcion Overloading using data type.
    public static String  sum(String a,String b) {
        return a+b;
    }
    public static float sum(float a, float b) {
        return a+b;
    }

    //Function Overload Using Parameters.
    public static  int sum(int a,int b) {
        return a+b;
    }
    public static int  sum(int a,int b,int c) {
        return a+b+c;
    }
}
