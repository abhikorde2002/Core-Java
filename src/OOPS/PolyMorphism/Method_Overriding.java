package OOPS.PolyMorphism;

public class Method_Overriding {
    public static void main(String[] args) {
        Deer deer = new Deer();
        deer.eat();
    }
}

class Animal {
    String color;

    void eat() {
        System.out.println("Eats");
    }

    void swim() {
        System.out.println("Swim");
    }

    void fly() {
        System.out.println("Flying");
    }
}

class Deer extends Animal {
    void eat() {
        System.out.println("Eats Grass");
    }
}
