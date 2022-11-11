import java.util.Scanner;
    public class Mathematicaltable{
  public static void main(String[]args){
    int number,multipl;
    System.out.println("Enter the number");
    Scanner s1=new Scanner(System.in);
    number=s1.nextInt();
    for(int i=1;i<=10;i++){
         multipl=number*i;
       System.out.println(number+" * "+i+" "+"="+multipl);

      }

}
}       
      