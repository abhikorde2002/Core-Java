package Multithreading;

public class Mythread extends Thread {
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("Child Thread");
        }
    }
}
class Test{
    public static void main(String[] args) {
        Mythread m = new Mythread();
        m.start();
    
        for(int i=1;i<=10;i++){
            System.out.println("Parent Thread");
        }
    }

}
