package Collection.Object_Class;

public class Equals_St {
    String name;
    int id;

    Equals_St(String name,int id){
        this.id=id;
        this.name=name;
    }

}

class Equal{
    public static void main(String[] args) {
        Equals_St e = new Equals_St("Abhi", 101);
        Equals_St e1= new Equals_St("Puneeth", 102);
        Equals_St e2= new Equals_St("Abhi", 103);
        Equals_St e3=e;
        System.out.println(e.equals(e3));
        System.out.println(e.equals(e2));
        System.out.println(e.equals(e1));
    }
}

/*
true
false
false
 */