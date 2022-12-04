package OOPS.Constructor;

public class Constrctor {
    public static void main(String[] args) {
        Student student = new Student("Abhishek");
        System.out.println(student.name);
        Student s1 = new Student(23);
        System.out.println(s1.roll);
    }
}

class Student {
    int roll;
    String name;

    Student(String name) {
        this.name = name;
    }

    Student(int roll) {
        this.roll = roll;
    }
}
