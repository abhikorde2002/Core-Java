package OOPS.Constructor;

public class Deep_copy {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Abhi";
        s1.roll = 02;
        s1.password = "Abhi";
        s1.marks[0] = 12;
        s1.marks[1] = 20;
        s1.marks[2] = 19;

        Student s2 = new Student(s1);
        s2.password = "Jack";
        s1.marks[2] = 12;
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
    }

}

class Student {
    String name;
    int roll;
    String password;
    int marks[];

    Student() {
        System.out.println("Cons");
        marks = new int[3];
    }

    // Deep Copy
    // Copy constructor
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }

    Student(String name) {
        marks = new int[3];
        this.name = name;
    }

    Student(int roll) {
        marks = new int[3];
        this.roll = roll;
    }

}
