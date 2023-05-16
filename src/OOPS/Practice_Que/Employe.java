package OOPS.Practice_Que;

public class Employe {
   int sal;
   String name;
   public int getSalary(){
    return sal;
   }

   public String getName(){
    return name;
   }
   public void setName(String name){
       this.name=name;
   }
}
 class hii{
   public static void main(String[] args) {
      Employe e = new Employe();
      e.setName("Abhi");
      System.out.println(e.getName());
   }
}

