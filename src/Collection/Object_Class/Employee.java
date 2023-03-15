package Collection.Object_Class;

public class Employee {
     String name;
     int id;

     Employee(String name,int id){
        this.name=name;
        this.id=id;

     }
     public int hashCode(){
        return id;
     }
    }
     class EmployeeDemo{
        public static void main(String[] args) {
            Employee e = new Employee("Raj", 100);
            Employee e1= new Employee("Puneeth", 101);

            System.out.println(e.hashCode());
            System.out.println(e1);
        }
     }

/*
100
Collection.Object_Class.Employee@65
 */