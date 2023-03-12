package Collection;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class Properties1 {
    public static void main(String[] args) throws Exception {
        Properties p=new Properties();
        FileInputStream fis= new FileInputStream("ps.properties");
        p.load(fis);
        System.out.println(p);
        System.out.println(p.getProperty("umesh"));//8000
        p.setProperty("Priya", "500");
        FileOutputStream fos= new FileOutputStream("ps.properties");
        p.store(fos, "updated ");
    }
}
