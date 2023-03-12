package Multithreading;

import java.net.SocketPermission;

public class Test12 {
     public static void main(String[] args) {
        System.out.println("Main Thread"+Thread.currentThread());
     //   System.out.println("Main Thread "+Thread.currentThread().getName());

        Multiple m = new Multiple();
        m.setName("Hello coders");
        m.start();

        Thread.currentThread().setName("Hello Jack");
        System.out.println("Main Thread" + Thread.currentThread().getName());
     }
}

class Multiple extends Thread{
    public void run(){
        System.out.println("Child Thread "+Thread.currentThread());
        System.out.println("Child thread running");
        System.out.println("Child Thread "+Thread.currentThread().getName());
    }
}
