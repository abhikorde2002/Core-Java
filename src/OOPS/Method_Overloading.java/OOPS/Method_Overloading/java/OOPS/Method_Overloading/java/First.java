

public class First{
    public static void main(String[] args) {
        First f= new First();
        f.add();
        f.add(1, "a");
        f.add(1, 1);
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
