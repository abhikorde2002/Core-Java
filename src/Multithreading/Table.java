package Multithreading;

public class Table {
    void printTable(int n){
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
class MyThread1 extends Thread{
    Table t ;
    MyThread1(Table t){
        this.t=t;
    }
    public void run(){
        t.printTable(5);
    }
}
class Nosync{
    public static void main(String[] args) {
        Table obj = new Table();

        MyThread1 t1 = new MyThread1(obj);
        MyThread1 t2 = new MyThread1(obj);
        t1.start();
        t2.start();
    }
}
