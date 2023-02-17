package Multithreading;

public class Exceptions12 extends Thread {
 public void run(){
    try{
        for(int i=1;i<=5;i++){
            System.out.println("Child Thread");
            Thread.sleep(1000);
        }
    }
    catch(InterruptedException e){
        System.out.println("Child interrupted");
    }
 }
    
}

class InterruptDemo{
    public static void main(String[] args) {
     Exceptions12 interrupt = new Exceptions12();
     interrupt.start();
     interrupt.interrupt();
     for(int i=1;i<=5;i++){
        System.out.println("Main Thread");
     }
    }
}
