package Collection;

public class Lg_Projecter implements Lremote{

    @Override
    public void turnon() {
     System.out.println("Lg Tv on");   
    }

    @Override
    public void turnOff() {
        
       System.out.println("TV off");
    }

    @Override
    public void freeze() {
       System.out.println("Tv got freeze");
    }
    
}
