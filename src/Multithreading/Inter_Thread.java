package Multithreading;

import Search.time;

public class Inter_Thread  extends Thread{
    int Total =0;
    public void run(){
      for (int i=1;i<=100;i++){
        Total = Total+i;
      }
      this.notify();
    }
    
}

class Thr {
    public static void main(String[] args) throws InterruptedException {
        Inter_Thread t = new Inter_Thread();
        t.start();
        t.wait();
        System.out.println("Total is :-" +t.Total);
    }
}