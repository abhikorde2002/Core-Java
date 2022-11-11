package classcomponent;

public class methods {
    public  static void main(String[] args) {
        methods methods = new methods();

        System.out.println(add(100,5));//When we are creating static method.
        System.out.println( methods.minus(2,7));//when we are creating instant method.
        methods.div(2,2);
        mul(2,5);

    }
    public static int add(int a, int b){
        int c=a+b;
        return c;
    }
    public  int  minus(int a, int b) {
        int d = a - b;
        return d;
    }
    public void  div(int a,int b){
        int e=a/b;
        System.out.println(e);
    }
    public static void mul(int a,int b){
        int f=a*b;
        System.out.println(f);
    }
}
