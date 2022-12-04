package OOPS;

public class Classes_Object {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.color = "Yellow";
        System.out.println(p1.color);
    }
}

class Pen {
    String color;
    int tip;

    void setColor(String newcolor) {
        color = newcolor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }

}
