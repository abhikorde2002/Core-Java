package Abhi.practiceQuesion;

public class fibonacci {
    static int num1=0,num2=1,num3=0;
    public static void main(String[] args) {
        int num=5;
        System.out.println(feb2(num));
//        System.out.print(num1+"  "+num2);
//        feb1(num);
      //  feb(num);
    }
    static void feb(int num){
        int num1=0,num2=1,num3=0;
        System.out.print(num1+" "+num2);
        for (int i=2;i<num;++i) {
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            System.out.print(" "+num3);

        }
//        return 0;
    }
    static void feb1(int num){

        if(num>0){
            num3=num1+num2;
            num1=num2;
            num2=num3;
            System.out.print("  "+num3);
            feb1(num-1);
        }
    }
    static int feb2(int num){
//        if (num==1){
//            return 0;
//        }
//        else if(num==2){
//            return 1;
//        }
        if (num==1 || num==2){
            return num-1;
        }
        else {
            return feb2(num-1)+feb2(num-2);
        }
    }
}
