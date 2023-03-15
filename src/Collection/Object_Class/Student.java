package Collection.Object_Class;

public class Student {
    String name;
    int id;

    Student(String name,int id){
        this.name=name;
        this.id=id;
    }

    public String toString(){
        return id+ " " +name;
    }


}

class Obj{
    public static void main(String[] args) {
        Student s= new Student("Abhishek", 1);
        Student s1= new Student("Laxman", 2);
        Student s2= new Student("Jack", 3);
        System.out.println(s);
        System.out.println(s1.toString());
    }
}
