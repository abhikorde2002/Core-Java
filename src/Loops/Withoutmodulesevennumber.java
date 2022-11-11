public class Withoutmodulesevennumber {
    public static void main(String[]args){
        int number=100;
        int sum=0;
        System.out.println("Enter the number:");
        for(int i=2;i<=number;i=i+2){
            sum=sum+i;
            System.out.println(i+" "+sum);
        }
        System.out.println( "Sum of 1to 100 even number is :"+sum);
    }
}
