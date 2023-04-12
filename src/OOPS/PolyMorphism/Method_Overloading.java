package OOPS.PolyMorphism;

public class Method_Overloading {
    public static void main(String[] args) {
        Method_Overloading m= new Method_Overloading();
        m.add();
        m.add(1, "a");
        m.add(2, 3);
    }

    public void add(int a,int b){
        System.out.println("1 method");
    }
    public void add(int a,String b){
        System.out.println("2 Method");
    }
    public void add(){
        System.out.println("3 Method");
    }
}
