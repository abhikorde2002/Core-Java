import java.util.Scanner;

public class OTP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min=1000;
        int max=9999;
        int sOTP=(int)((Math.random()*(max-min))+min);
        System.out.println("OTP :" +sOTP);
        int uOTP;
        System.out.println("Enter OTP :- ");
        uOTP=scanner.nextInt();
        String result;
        result =((sOTP==uOTP)?"valid OTP" : "Invalid OTP");
        System.out.println(result);
    }
}
