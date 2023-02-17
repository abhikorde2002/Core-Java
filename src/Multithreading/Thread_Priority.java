package Multithreading;

import java.net.Socket;

public class Thread_Priority {
   public static void main(String[] args) {
    System.out.println("Main Thread"+Thread.currentThread().getPriority());
    //   System.out.println("Main Thread "+
    Thread.currentThread().setPriority(1);;

       Multiple m = new Multiple();
       System.out.println("Child Thread"+m.getPriority());
       m.setPriority(10);
       m.start();

       for(int i=1;i<=5;i++){
        System.out.println("Parent Thread");
    }
   }
   

      
}

class Multi extends Thread{
    public void run(){
        System.out.println("Child Thread "+Thread.currentThread().getPriority());
        for(int i=1;i<=5;i++){
            System.out.println("Child Thread");
        }
    }
}
