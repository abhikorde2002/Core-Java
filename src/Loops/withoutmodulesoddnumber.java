public class withoutmodulesoddnumber {
    public static void main(String[]args){
        int number=100;
        int sum=0;
        System.out.println("Enter the number");
        for(int i=1;i<=number;i=i+2){
            sum=sum+i;
            System.out.println(i+" "+sum);
        }
        System.out.println(sum);
    }

}
