package Multithreading;

public class Synchronized_Block {
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

class My extends Thread{
    Synchronized_Block t;
    My(Synchronized_Block t){
        this.t= t;
    }
    public void run(){
        t.printTable(5);
    }
}

class Syn_Block{
  public static void main(String[] args) {
    Synchronized_Block s = new Synchronized_Block();

    My m= new My(s);
    My m1 = new My(s);
    m.start();
    m1.start();
  }
}
