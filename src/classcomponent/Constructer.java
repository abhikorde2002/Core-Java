package classcomponent;

public class Constructer {
     int rollnumber;
     String name;


    Constructer(){
        System.out.println("Hello");
    }
    Constructer(int roll,String name){
     this.rollnumber = roll;
     this.name=name;
        System.out.println(methods.add(2,5));

    }
    public static void main(String[] args) {
        Constructer constructer1 = new Constructer();
        Constructer constructer = new Constructer(2,"Abhi");
        System.out.println(constructer.name+" "+constructer.rollnumber);

    }

}
