package OOPS.Abstract;

import Pattern.Hollow_pattern.Hollow_Rhombus;

public class abc {
    public static void main(String[] args) {

        Horse horse = new Horse();
        horse.eat();
        horse.walk();
        System.out.println(horse.color);
    }
}

abstract class Animals {
    String color;

    abstract void eat();

    void swim() {
        System.out.println("Swim");
    }

    Animals() {
        System.out.println("Animal Constructor is called");
    }

    abstract void walk();

    void fly() {
        System.out.println("Flying");
    }
}

class Horse extends Animals {
    void changcolor() {
        color = "Dark Brown";
    }

    Horse() {
        System.out.println("Hourse Constructor is called");
    }

    @Override
    void eat() {
        System.out.println("Hourse eat grass");
    }

    void walk() {
        System.out.println("Walk on 4 legs");
    }
}

class Dog extends Animals {

    @Override
    void eat() {
        System.out.println("Dog eat meat");

    }

    @Override
    void walk() {
        System.out.println("It walk on 4 legs");
    }

}
