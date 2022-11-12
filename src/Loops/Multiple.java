import java.util.Scanner;

//Display all num entered by user except multiples of 10.
public class Multiple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("Enter the number:- ");
            int n=scanner.nextInt();
            if(n % 10==0){
                continue;
            }
            System.out.println("Number was :- "+ n);
        }
        while(true);
    }
}
