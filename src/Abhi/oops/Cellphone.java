package Abhi.oops;

public class Cellphone {
    public static void main(String[] args) {
        Cellphone cellphone= new Cellphone();
        cellphone.ring();
        cellphone.vibrate();
    }
    public void ring(){
        System.out.println("The Phone is Ringing");
    }
    public void vibrate(){
        System.out.println("The Phone is Vibrating");
    }
}
