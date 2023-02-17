package Multithreading;

public class Inter_ThreadCommunication extends Thread { 
    int total =0;
     public void run(){   
        for(int i=1;i<=100;i++){
            total = total+i;
        }  
    }
}
class Thread1{
    public static void main(String[] args) throws InterruptedException {
        Inter_ThreadCommunication t = new Inter_ThreadCommunication();
        t.start();
        Thread.sleep(2000);

        System.out.println("Total is:-" +t.total);
    }
}
