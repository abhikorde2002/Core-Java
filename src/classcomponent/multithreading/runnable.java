package classcomponent.multithreading;

public class runnable implements Runnable{
    public void run() {
        for (int i=0;i<5;i++){
            System.out.println("Hello");
        }
    }
}
class B{
    public static void main(String[] args) {
        runnable run = new runnable();
        Thread the = new Thread(run);
        the.start();
        for (int i=0;i<5;i++){
            System.out.println("Jack");
        }
    }
 }


