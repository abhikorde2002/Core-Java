package Collection.Object_Class;

public class Clones  implements Cloneable{
    int a=10;
    int b=20;

    public static void main(String[] args)  throws CloneNotSupportedException{
        Clones c = new Clones();
        Clones c1=(Clones) c.clone();
        c1.a=100;
        c1.b=200;
        System.out.println(c.a+" "+c.b);
        System.out.println(c1.a+" "+c1.b);
    }
}
