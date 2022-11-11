package classcomponent;

public class Shadowing {
    static int x=90;//it will be shadowed at line 8
    public static void main(String[] args) {
        System.out.println(x);//90
        int x=40;//The class variable x=90 is shadowed by x=40;
        System.out.println(x);//40
        fun();

    }
    static void fun(){
        System.out.println(x);
    }
}
