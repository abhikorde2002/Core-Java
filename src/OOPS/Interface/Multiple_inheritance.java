package OOPS.Interface;

public class Multiple_inheritance {
    public static void main(String[] args) {
        Bear bear = new Bear();
        bear.eat();
        Sum s= new Sum();
        s.Add();
        s.add(2, 4);
        s.eat();
    }
}

interface herbivore {
    void eat();
}

interface Carnivore {
    void eat();
}
interface Add extends herbivore,Carnivore{
    void Add();
    void add(int x, int y);
}
class Sum implements Add{
    public void Add(){
        System.out.println("Helllo");
    }
    public void eat(){
        System.out.println("I am Eating");
    }
    public void add(int x, int b){
        int c=x+b;
        System.out.println(c);
    }
}
class Bear implements herbivore, Carnivore {
    public void eat() {
        System.out.println("Bear Eat Fishes");
    }
}
