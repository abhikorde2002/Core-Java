package Multithreading;

public class yields extends Thread {
    public void run(){
        for(int i=1;i<=5;i++){
          System.out.println("Child Thread");
        }
    }
}
class Hello extends Thread{
    public void run(){
        System.out.println("Thread 1");
    }
}
class Demo{
    public static void main(String[] args) {
        yields y = new yields();
        y.start();
        y.yield();


        // Hello h = new Hello();
        // h.start();

        for(int i=1;i<=5;i++){
            System.out.println("Main Thread");
        }
    }

}
