package Collection;

public class Samsung_Projecter implements Lremote{

    @Override
    public void turnon() {
        System.out.println("Samsung TV on");
    }

    @Override
    public void turnOff() {
        System.out.println("Samsung TV off");
    }

    @Override
    public void freeze() {
        System.out.println("Samsung TV Freeze");
    }
    
}
