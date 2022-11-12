public class fibonacci {
    public static void main(String[] args) {
        int num=0;
        int num1=1;
        int num2=0;
        System.out.print(num+ "  " +num1+" ") ;
        int count=10;
        withRec(num, num1, num2, count-2);
        // withoutRec(num, num1, num2, count);
    }
    static void withoutRec(int num,int num1,int num2, int count){
        for(int i=2;i<count;i++){
            num2=num+num1;
            num=num1;
            num1=num2;
            System.out.print("  "+num2);
       }
    }
    static void withRec(int num,int num1,int num2,int count){
        if(count>0){
            num2=num+num1;
            System.out.print("  "+num2);
            num=num1;
            num1=num2;
            withRec(num, num1, num2, count-1);
        }
    }
    
}
