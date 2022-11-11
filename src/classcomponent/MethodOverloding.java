package classcomponent;

public class MethodOverloding {
    public static void main(String[] args) {
        fun(33);
        fun("Abhi");
        fun(2,6);

    }
    static  void  fun(int a){
        System.out.println(a);
    }
    static  void  fun(String name){
        System.out.println(name);
    }
    static  void  fun(int a,int b){
        System.out.println(a+b);
    }
}
