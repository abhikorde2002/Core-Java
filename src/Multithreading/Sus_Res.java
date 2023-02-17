package Multithreading;

public class Sus_Res  extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Childe Thread");
        
        try{
            Thread.sleep(1000);
        }
        catch(Exception e){
            System.out.println("Childe Interrupted");
        }
    }
}
}
class Code{
    public static void main(String[] args) {
        Sus_Res s = new Sus_Res();
            s.start();
            s.suspend();
            for(int i=1;i<=5;i++){
                System.out.println("Main Thread");
            }
            s.resume();
          //  s.stop();
    }
}
