package Practice_Quesion.Loop;
//Find the Sum of the digit Program
public class Sum_Digits {
    public static void main(String[] args) {
        Sum_d(120);
    }
    static void Sum_d(int num){
        int sum=0;

        while(num>0){
          int dig=num%10;
          sum+=dig;
          num/=10;
        }
        System.out.println(sum);
    }
}
