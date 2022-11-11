package Abhi.oops;

public class Employ {
    int salary;
    String name;
    public static void main(String[] args) {
        Employ employ = new Employ();
        employ.setName("Abhishek");
        System.out.println(employ.getName());
        employ.setSalary(50000);
        System.out.println(employ.getSalary());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
