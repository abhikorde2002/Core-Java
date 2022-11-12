package Abhi;

public class DivisionwithoutModule {
    public static void main(String[] args) {
     DivisionwithoutModule d = new DivisionwithoutModule();
     d.Division(21,5);

    }

    public  void Division(int n,int m){
        int abhi=0;
        int num;
        while (n>0){
            n=n-m;
            abhi++;
        }
        System.out.println(n+"is Reminder "+"Quotient is " + abhi);

    }
}
