package Multithreading;

public class Inter_Thread_Join extends Thread{
    int total =0;
    public void run(){   
       for(int i=1;i<=100;i++){
           total = total+i;
       }  
   }
}
class Thread11{
    public static void main(String[] args) throws InterruptedException {
        Inter_Thread_Join t = new Inter_Thread_Join();
        t.start();
        t.join();

        System.out.println("Total is:-" +t.total);
    }
}
