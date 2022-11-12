import java.util.Scanner;

class continuous{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Enter the number:- ");
            int num=scanner.nextInt();
            if(num%10==0){
                break;
            }
            if(num==3){
                continue;
            }
        }
        while(true);
    }
}