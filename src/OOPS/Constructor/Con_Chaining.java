package OOPS.Constructor;

public class Con_Chaining {
    public static void main(String[] args) {
        child c= new child();
    }
}

class Parent{
    Parent(){
        System.out.println("Hello coder");
    }
}
class child extends Parent{
    child(){
        System.out.println("I am Abhishek");
    }
}
