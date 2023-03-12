package Multithreading;

public class Interrupted extends Thread {
       public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Child Thread ");
        }
        System.out.println("I want to sleep");
       try{
        Thread.sleep(1000);
       }   
       catch(InterruptedException e){
        System.out.println("Child got Interrupted");
       }
    }    
}

class IntDemo{
    public static void main(String[] args) {
        Interrupted i = new Interrupted();
        i.start();
        i.interrupt();
        for(int j=0;j<=5;j++){
            System.out.println("Hello");
        }
    }
}
