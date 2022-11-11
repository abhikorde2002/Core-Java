import java.security.spec.RSAOtherPrimeInfo;
// 6=1+2+3
public class Perfectnumber {
    public static void main(String[] args){
        int number=6;
        int sum=0;
      for(int i=1;i<=number/2;i++){
          if(number%i==0){
              sum=sum+i;
              System.out.println(i);
          }
      }
        System.out.println((number==sum)?"Its perfect number":"Its not a perfect number");
    }
}
