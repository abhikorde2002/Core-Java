package OOPS.Inheritance;

public class Hierarchial {
    public static void main(String[] args) {
        Mammal1 mammal1 = new Mammal1();
        mammal1.walk();
        Fish fish = new Fish();
        fish.swim();
        Bird bird = new Bird();
        bird.fly();
        Reptiles rep = new Reptiles();
        rep.swim();
    }
}

class Animal extends Hierarchial{
    String color;
    
    void eat() {
        System.out.println("Eats");
    }

    void breathe() {
        System.out.println("Breathing");
    }

}

class Fish extends Animal {
    void swim() {
        System.out.println("Swim");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("Flying");
    }
}

class Reptiles extends Animal {
    void swim() {
        System.out.println("Swims");
    }
}

class Mammal1 extends Animal {
    void walk() {
        System.out.println("Waks");
    }
}
