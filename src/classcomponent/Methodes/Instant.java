package classcomponent.Methodes;

public class Instant {
    public static void main(String[] args) {
        Instant ins= new Instant();
       // System.out.println(ins.add(20, 50));
       // ins.mul(50, 70);
       // int num=100;
       // ins.even(num);
        ins.evenNum(10, 20);
    }
    public int add(int a,int b){
        int c=a+b;
        return c;
    }
    public void mul(int a,int b){
        int c=a*b;
        System.out.println(c);
    }
    public void even(int num){
        for(int i=0;i<num;i++){
            if(i%2==0){
                System.out.println("Even number:- "+i);
            }
            else{
                System.out.println("Odd numbver is:- "+i);
            }
        }
    }

    public void evenNum(int n,int end){
         if(n >end){
            return;
         }
         if(n%2==0){
            System.out.println(n+" ");
            evenNum(n+2, end);
         }
         else{
            evenNum(n+1, end);
         }
        
    }
}
