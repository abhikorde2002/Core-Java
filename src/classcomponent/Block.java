package classcomponent;

public class Block {
    int count=0;
    public static void main(String[] args) {
        Block block = new Block();
        Block block1=new Block();
//        Constructer constructer = new Constructer();
//        Constructer constructer1 = new Constructer(2,"Jack");
//        System.out.println(constructer1.rollnumber+" "+constructer1.name);
    }
    Block(){
        System.out.println("count is"+count);
    }
    {
        count++;

    }
    static {
        System.out.println("Hello i am abhishek");
    }

}
