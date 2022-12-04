package classcomponent;

public class Super_Keyword {
    public static void main(String[] args) {
        Deer deer = new Deer();
        System.out.println(deer.color);
    }
}

class Animal {
    String color;

    Animal() {
        System.out.println("Animal Constructor");
    }

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
    Deer() {
        super.color = "Black";
        System.out.println("Deer Constructor");
    }

    void eat() {
        System.out.println("Eats Grass");
    }
}
