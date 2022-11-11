package Abhi.oops;

public class Square {
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
    public static void main(String[] args) {
        Square square= new Square();
        square.side=2;
        System.out.println(square.area());
        System.out.println(square.perimeter());
    }

}
