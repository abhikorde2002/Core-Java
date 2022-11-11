package Abhi.oops.Encapsulation;
class Dell{
    public static void main(String[] args) {
        Laptop laptop= new Laptop(5,16);
        System.out.println("Dell Laptop Version is:-  "+ laptop.getVersion());
        System.out.println("Dell Laptop Ram is :- " +laptop.getRam());
        laptop.setName("Dell intel i5");
        System.out.println("Dell Laptop Name is:- " +laptop.getName());
        laptop.setPrice(50000);
        System.out.println("Dell Laptop Price is:-" +laptop.getPrice());
    }
}
public class Laptop {
   private int version;
   private int ram;
   private String name;
   private int price;

   Laptop(int version,int ram){
       this.version=version;
       this.ram=ram;
   }
    public void setVersion(int version) {
        this.version = version;
    }
    public int getVersion() {
        return version;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getRam() {
        return ram;
    }

    public void setName(String name) {
        boolean isAdmin= false;
        if(!isAdmin){
            System.out.println("You Don't Have Any authorization to Set Name ");
        }
        else {
            this.name = name;
        }
    }
    public String getName() {
        return name;
    }

    public void setPrice(int price) {
        boolean isAdmin=false;
        if (!isAdmin){
            System.out.println("You Don't Have Any authorization to Set Price");
        }
        else {
            this.price=price;
        }
    }

    public int getPrice() {
        return price;
    }
}
