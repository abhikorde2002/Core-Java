package classcomponent.Methodes;

public class staticMethodes {
    public static void main(String[] args) {
        System.out.println(add(23, 12));
        mul(343, 23);
    }

    public static int add(int a,int b){
        int c=a+b;
        return c;
    }
    static void mul(int a,int b){
        int c=a*b;
        System.out.println(c);
        
    }
    
}
