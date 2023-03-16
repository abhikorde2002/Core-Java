package Practice_Quesion.Loop;

public class Amstrong_Rang {
    public static void main(String[] args) {
        for(int i=0;i<1000;i++){
            if(range(i)){
                System.out.println(i);
            }
        }
    }

    static boolean range(int num){
        int sum=0;
        int ori=num;
        while(num>0){
           int digits=num%10;
           sum +=(digits*digits*digits);
           num=num/10;
        }
        if(sum==ori){
          return true;
        }
        else{
            return false;
        }
    }
}
