package Multithreading;

public class sleep extends Thread {
    public void run(){
        for(int i=1;i<=5;i++){
            try{
               Thread.sleep(1000);
                System.out.println("Child Thread");
            }
            catch(Exception e){
                System.out.println("Exception caught");
            }
        }
    }
}
// class Hello extends Thread{
//     public void run(){
//         System.out.println("Thread 1");
//     }
// }
class Demo{
    public static void main(String[] args) {
        sleep j = new sleep();
        j.start();
       // j.yield();

        // Hello h = new Hello();
        // h.start();

        for(int i=1;i<=5;i++){
            System.out.println("Main Thread");
        }
    }
}
