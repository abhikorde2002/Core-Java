package Abhi.Array.Linearsearch;

public class EvenDigits {
    public static void main(String[] args) {
        int []num={12,345,6,2,7896};
        System.out.println(findNumbers(num));
        System.out.println(digits(23242));
        System.out.println(digits2(32434545));
    }

    static int findNumbers(int[] num){
        int count=0;
        for (int number:num) {
            if (even(number)){
                count++;
            }
        }return count;
    }

    //finding even digit number
    static boolean even(int num){
        int numberofDigits= digits(num);
        if (numberofDigits % 2 ==0){
            return true;
        }
        return false;
    }

    //Find number of digits
    static int digits2(int num){
        if (num <0){
            num=num*-1;
        }
        return (int)(Math.log10(num))+1;
    }

  //count number of digits in a number.
    static int digits(int num){
        int count=0;
        if (num <0){
            num=num*-1;
        }
        if (num==0){
            return 1;
        }

        while (num >0){
            count++;
            num=num/10;
        }
        return count;
    }

}
