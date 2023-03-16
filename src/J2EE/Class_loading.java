package J2EE;

public class Class_loading {
    public static void main(String[] args) {
        try{
            Class.forName(".src.J2EE.Student");
    
    }
    catch (ClassNotFoundException e){
        e.printStackTrace();
    }
    }
}


