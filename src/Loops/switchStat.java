public class switchStat {
    public static void main(String[] args) {
        int num=5;

        switch (num){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Sunday");  
                break;
            case 7:
                System.out.println("Sunday");              
            default:
                System.out.println("Oops Somting went wrong");
        }
    }
}
