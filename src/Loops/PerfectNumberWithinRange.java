public class PerfectNumberWithinRange {
    public static void main(String[] args) {
        for (int num = 1; num <= 10000 ; num++) {
            IsPerfectnumber(num);
        }
    }
    static void IsPerfectnumber(int num) {
        int sum=0;
           for(int i=1;i<=num/2;i++){
               if(num%i==0){
                 sum=sum+i;
                }
           }
        System.out.print((num==sum)?sum+" ":"");
    }
}
