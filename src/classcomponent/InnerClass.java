package classcomponent;

public class InnerClass {
    //Static member.
    static int outer_x=30;
    //instance member.
    int outer_y=20;
    //private member.
    private int Outer_z=30;
    class Inn{
        void display(){
            //can access static member in inner class.
            System.out.println("Static member : " +outer_x);
            //can access Non-static member
            System.out.println("non-static member :" +outer_y);
            //can access private member.
            System.out.println("privet member : " +Outer_z);
        }
    }
    public static void main(String[] args) {
        InnerClass inn = new InnerClass();
        InnerClass.Inn inn1 =inn.new Inn();
        inn1.display();
    }


}
