package Practice_Quesion.Loop;

public class Binary {
    /*
     Binary numbers
     0= 000
     1=001
     2=010
     3=011
     4=100
     5=101
     6=110
     7=111;
     8=1000
     */
    public static boolean isBinaryNumber(int num)
    {
     
        if (num == 0 || num == 1
            || num < 0) {
            return false;
        }
        while (num != 0) {
            if (num % 10 > 1) {
                return false;
            }
            num = num / 10;
        }
        return true;
    }

    public static void main(String args[])
    {
        
        
        System.out.println(isBinaryNumber(1234));
    }
}
