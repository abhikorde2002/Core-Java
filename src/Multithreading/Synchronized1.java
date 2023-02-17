package Multithreading;

public class Synchronized1 {
    synchronized void printTable(int n){
        for(int i=1;i<=5;i++){
            System.out.println(n+"x"+i+"="+n*i+" "+Thread.currentThread().getName());
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
class MyThread12 extends Thread{
    Synchronized1 t ;
    MyThread12(Synchronized1 t){
        this.t=t;
    }
    public void run(){
        t.printTable(5);
    }
}
class Syn{
    public static void main(String[] args) {
        Synchronized1 s = new Synchronized1();
      
        MyThread12 m = new MyThread12(s);
        MyThread12 m1 = new MyThread12(s);
        m.start();
        m1.start();
        
    }
}
