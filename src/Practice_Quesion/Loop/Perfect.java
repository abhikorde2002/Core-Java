package Practice_Quesion.Loop;

public class Perfect {
    public static void main(String[] args) {
        perfect(6);
    }

    static void perfect(int num){
        int sum=0;
        for(int i=1;i<=num/2;i++){
            if(num%i==0){
                sum+=i;
            }
        }
       System.out.println(num==sum ? "Perfect number" : "Not Perfect");
    }

}
