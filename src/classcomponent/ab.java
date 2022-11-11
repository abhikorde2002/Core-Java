package classcomponent;

public class ab {
    public static void main(String[] args) {
         Jag jag = new Jag();
         jag.sart();
    }
}
 abstract class car{
    int price;
    abstract void sart();
}
class Jag extends car{
    @Override
    void sart() {
        System.out.println("Its Jagvar SUV");
    }
}
