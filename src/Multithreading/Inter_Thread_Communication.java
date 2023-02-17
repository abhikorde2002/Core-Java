package Multithreading;

public class Inter_Thread_Communication extends Thread  {
   
    int total=0;
    
    public void run(){
        synchronized(this){
            System.out.println("Child thread starts calculation");
            for(int i=0;i<=100;i++){
              total = total+i;
            }
            System.out.println("Child thread trying to give notification");
            this.notify();
        }
    }
}

class Thread3{
    public static void main(String[] args)throws InterruptedException {
        Inter_Thread_Communication t = new Inter_Thread_Communication();
        t.start();
        synchronized(t){
            System.out.println("Main thread trying to call wait()");
            t.wait();
            System.out.println("Main got notification ");
            System.out.println("Total is "+t.total);
        }
    }
}
