package OOPS.Static;

public class Student {
    String name;
    int roll;

    static String schoolName;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
}

class oo {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Abhi";
        student.schoolName = "YSPM";
        // System.out.println(student.schoolName);

        Student s1 = new Student();
        s1.schoolName = "R.F.Naike";
        System.out.println(s1.schoolName);
    }
}
