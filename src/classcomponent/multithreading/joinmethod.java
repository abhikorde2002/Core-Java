package classcomponent.multithreading;

public class joinmethod {
    public static void main(String[] args) throws InterruptedException {
         spacecraft spacecraft = new spacecraft();
         spacecraft.start();
         spacecraft.join();
        System.out.println("Countdown Completed..");
        System.out.println("Ready to Go , Lonching spacecraft");
    }

}
class spacecraft extends Thread{
    @Override
    public void run() {
        System.out.println("Count down started...");
      for (int i=10;i>=1;i--) {
          System.out.println(i);

          try {
              Thread.sleep(2000);
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
      }
    }


}
