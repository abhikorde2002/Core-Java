package Practice_Quesion.Loop;

public class Max_number {
    public static void main(String[] args) {
        int num=10;
        int num1=20;
        int num2=25;
        int num3=45;
        if(num >num1 && num> num2 && num > num3){
            System.out.println(num+"is greatest among three number ");
        }
        if(num1> num && num1 > num2 && num1> num3){
            System.out.println(num1 +"is greatest among three number ");
        }
        if(num2> num && num2>num1 && num2>num3){
          System.out.println(num2+"is greatest among three number ");
        }
        else{
            System.out.println(num3+"is greatest among three number");
        }
    }
}
