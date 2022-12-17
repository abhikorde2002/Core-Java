import java.util.Scanner;

public class Leap {
    public static void main(String[] args) {
        System.out.println("Enter year:-");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Its not leap year");
        }
        System.out.println(1700 % 4);
    }

}
