package Digites;

public class EvenNumSum {
    static int sumofEven=0;
    static int sumofOdd=0;
    public static void main(String[] args) {
       
        int num=2345;
        sumOf(num);        
    } 
    static void sumOf(int num){
      while(num>=0){
        int dig=num%10;
        if(num%2==0){
            sumofEven=sumofEven+dig;         
        }
        else{
            sumofOdd=sumofOdd+dig;
        }
        num=num/10;
      }
      System.out.println("Even sum:-"+sumofEven);  
      System.out.println("Odd sum:- "+sumofOdd);
    }
    
    
}
