package Multithreading;

public class Synchronized3 {
    void printTable(int n){
        //10 thousand lines of code
        synchronized (this){
        try{
        for(int i=1;i<=5;i++){
            System.out.println(n+"x"+i+"="+n*i+" "+Thread.currentThread().getName());
           
                Thread.sleep(1000);
            }
        }
            catch(Exception e){
                System.out.println(e);
            }
        }
        //10 thousand lines of code
    }
}
class My1 extends Thread{
    Synchronized3 t; 
    My1(Synchronized3 t){
        this.t= t;
    }
    public void run(){
        t.printTable(5);
    }
}
class Syn_Block1{
    public static void main(String[] args) {
     Synchronized3 s = new Synchronized3();
     Synchronized3 s1 = new Synchronized3();
      My1 m= new My1(s);
      My1 m1 = new My1(s1);
      m.start();
      m1.start();
    }
  }
  
