package Exception_Handling;

public class StackOverflow {
   
    void fun1(){
        System.out.println("Inside fun!");
        fun2();
       }
       
    void fun2(){
        System.out.println("Inside fun2!");
        fun1();  
      
   
    }
}
class StckOVerFlow{
    public static void main(String[] args) {
        StackOverflow s = new StackOverflow();
        s.fun1();
    }
}
