package OOPS.Inheritance;

public class Multileve {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        System.out.println(dog.color = "White");
        dog.swim();
        System.out.println(dog.breed = "Pitbul");
        System.out.println(dog.legs = 4);
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

class Mammal extends Animal {
    int legs;

}

class Dog extends Mammal {
    String breed;
}
