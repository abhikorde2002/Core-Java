package Multithreading;

public class joins  extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Thread name is " + Thread.currentThread().getName());
           try{
            Thread.sleep(1000);
          
           }
           catch(Exception e){
            System.out.println("Exception");
           }
        }
    }
}
class Helllos {
    public static void main(String[] args) {
        // yields y = new yields();
        //  y.start();
         joins j= new joins();
         j.start();
        try {
            j.join(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            System.out.println("Exception");
        }
        //y.yield();


        for(int i=1;i<=5;i++){
            System.out.println("Main Thread"+"Thread name is " + Thread.currentThread().getName());
        }
    }
}