package OOPS.Static;

public class Student_Percentage {
    String name;
    int roll;

    static String schoolName;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    static int returnPercentage(int math, int phy, int chem) {
        return (math + phy + chem) / 3;
    }

    public static void main(String[] args) {
        Student_Percentage s1 = new Student_Percentage();
        s1.name = "Abhishek";
        s1.roll = 2;
        System.out.println(s1.name + " " + s1.roll);
        System.out.println(s1.returnPercentage(80, 70, 80) + "%");
        ;

    }
}
