package Practice_Quesion.Array;

public class Factorial {
    public static void main(String[] args) {
       System.out.println( fun(5));
       fun1(5);
    }

    static int fun(int n){
         if(n==0 || n==1 ){
            return n;
         }
         return n* fun(n-1);
    }

    static void fun1(int n){
        int res=1;
         for(int i=1;i<=n;i++){
            res *=i;
         }
         System.out.println(res);
    }
}
