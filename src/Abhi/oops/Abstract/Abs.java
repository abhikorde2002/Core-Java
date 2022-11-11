package Abhi.oops.Abstract;

class Abs {

    public static void main(String[] args) {
    Audi a = new Audi();
        a.Price=990000;
        System.out.println(a.Price);
        a.Gare=7;
        System.out.println(a.Gare);
    }
}
    abstract class car{
      int Price;
      int Gare;
     abstract void Color();
    void start(){
        System.out.println("Hello ,Car is About to Start");
    }
}
   class Audi extends car{
    @Override
    void Color() {
        System.out.println("Color is Black");
    }

    @Override
    void start() {
        super.start();
    }
}
