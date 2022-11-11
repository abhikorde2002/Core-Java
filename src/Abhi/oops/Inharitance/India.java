package Abhi.oops.Inharitance;

public class India {
    int GDP;
    int Mil;
    public India(int GDP,int Mil){
        this.GDP=GDP;
        this.Mil=Mil;
    }
    public void Population(){
        System.out.println("India Is The Second Large Population Contre ");
    }
    public void People(){
        System.out.println("Indian People are very help full in nature");
    }

}
class Maharashtra extends India{

    public static void main(String[] args) {
 Maharashtra maharashtra = new Maharashtra(15,2100000);
        System.out.println("Military Strength:- "+maharashtra.Mil);
        System.out.println("GDP Of Maharashtra:-  "+maharashtra.GDP);
    }
    public Maharashtra(int GDP, int Mil) {
        super(GDP, Mil);
    }

    @Override
    public void Population() {
        System.out.println("Maharashtra Is The Second Large Population state in India");
    }

    @Override
    public void People() {
        System.out.println("Maharashtra People are very help full in nature");
    }
}
