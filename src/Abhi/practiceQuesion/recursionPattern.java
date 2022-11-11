package Abhi.practiceQuesion;

public class recursionPattern {
    public static void main(String[] args) {
        pattern2(5);
    }
    static void pattern1(int num){
        if (num>0){
            pattern1(num-1);
            for (int row = 0; row < num; row++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern2(int num){
        if (num>0){
            for (int row = 0; row < num-row; row++) {
                pattern2(row);
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
