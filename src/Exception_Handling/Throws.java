package Exception_Handling;

public class Throws {
//    public static void main(String[] args)  throws ArithmeticException{
//     int a=20/0;
//     System.out.println("Main terminated Normaly");
//    }    
 
void fun(){
    System.out.println("Enter the fun");
    try{
        fun2();
    }
    catch(Exception e){
        System.out.println(e.getMessage());
    }
}
 void fun2() throws ArithmeticException{
    System.out.println("Entering the fun2");
    int a=20/0; 
}
 public static void main(String[] args) {
    Throws t= new Throws();
    t.fun();

 }
}
