package classcomponent;

public class scope {
    public static void main(String[] args) {
        int a= 10;
        int b=20;

        {
       //     int a=55;We cant initialise again in block.
            a=33;//we can update in block.
            int c=11;
        }
        //System.out.println(c);Cant ue value which are initialise in block.
        System.out.println(a);
        int c=100;//But You can initialise again outside the block.

        for (int i=0;i<4;i++){
           // int a=110;We can not initialise again .But we can Update that variable .
            a=110;


        }


    }
}
