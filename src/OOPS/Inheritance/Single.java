package OOPS.Inheritance;

public class Single {

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

class cat extends Animal {
    public static void main(String[] args) {
        cat dark = new cat();
        dark.color = "Black";
        dark.eat();
        dark.swim();
        System.out.println(dark.color);
    }
}
