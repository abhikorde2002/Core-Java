package OOPS.Interface;

public class Multiple_inheritance {
    public static void main(String[] args) {
        Bear bear = new Bear();
        bear.eat();
    }
}

interface herbivore {
    void eat();
}

interface Carnivore {
    void eat();
}

class Bear implements herbivore, Carnivore {
    public void eat() {
        System.out.println("Bear Eat Fishes");
    }
}
