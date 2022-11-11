public class sumof1to100 {
    public static void main(String[]args){
        int number=100;
        int sum=0;
        for(int i=1;i<=number;i++){
            sum=sum+i;
            System.out.println(i+" "+sum);

        }
        System.out.println("Addition of 1 to 100 is"+sum);
    }
}
