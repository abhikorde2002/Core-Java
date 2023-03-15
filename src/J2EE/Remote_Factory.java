package Collection;

public class Remote_Factory {
    public static Lremote getProjector(String type){
        
        if(type.equalsIgnoreCase("Lg Projecter")){
            return new Lg_Projecter();
        }
        else if(type.equalsIgnoreCase("Samsung Projecter")){
            return new Samsung_Projecter();
        }
        else{
            System.out.println("No such Projecter found");
        }
       return null;

    }
}
