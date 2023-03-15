package Collection;

import java.util.Scanner;

public class Test_Projecter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Projecter:- ");
        String val=scanner.nextLine();
        Lremote remote= Remote_Factory.getProjector(val);
        if(remote!=null){
            remote.turnon();
            remote.freeze();
            remote.turnOff();
        }
    }
}
