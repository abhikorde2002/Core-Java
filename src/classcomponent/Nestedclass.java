package classcomponent;

public class Nestedclass {
    //Java program to accessing Static nested member.
    //static member.
    static int outer_x= 10;

    //instance member.
    int Outer_y=20;

    //privet static member.
    private static int outer_privet=30;

    //static nested class start with static keyword.
    static class StaticNestedClass{
        void display(){
            System.out.println("Static outer member is : " +outer_x);

            System.out.println("Static privet member is : " +outer_privet);

           // System.out.println(Outer_y);
        }

        public static void main(String[] args) {
            Nestedclass.StaticNestedClass nestedClass=new Nestedclass.StaticNestedClass();
            nestedClass.display();
        }

    }
}
