package classcomponent;

public class encap {
    private int price;

    public void setPrice(int price) {
       boolean isAdmin=true;
       if (!isAdmin){
           System.out.println("You don't have any authority to chang");
       }
       else {
           this.price=price;
       }
    }

    public int getPrice() {
        return price;
    }

    public static void main(String[] args) {
      encap encap = new encap();
      encap.setPrice(20000);
        System.out.println(encap.getPrice());
    }
}
