package Abhi.oops.Polymorphism;

public class Person {
    String name;
    int age;

    void walk(){
        System.out.println(name +" is Walking");
    }
    void running(){
        System.out.println(name+"is Running");
    }
    void walk(String name,int age){
        System.out.println(name+ "is "+age + "Year Old");
    }
    void walk(int age){
        System.out.println(name + "is "+age);
    }
}
class Poly {

    public static void main(String[] args) {
    Person person = new Person();
    person.name="Jack";
    person.walk();
    person.running();
    person.walk("Abhi",21);
    person.walk(22);
    }
}
