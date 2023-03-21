package Practice_Quesion.Series_Program;

import java.util.Scanner;

public class Second_Quesion {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        float n=scanner.nextFloat();
        float sum=0;
        for(float i=1;i<=n;i++){
            sum=(float)sum+(1/(2*i-1));
        }
        System.out.println(sum);
    }
}
