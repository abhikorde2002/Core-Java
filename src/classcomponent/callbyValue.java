package classcomponent;

public class callbyValue {
    public static void main(String[] args) {
      int a=10;
      int b=20;
      change(a,b);
   //     System.out.println(change(a,b));
        System.out.println(a+" "+b);
    }
    static void change(int a, int b){
       int tem=a;
       a=b;
       b=tem;
     //   System.out.println(a+" "+b);

    }


}
