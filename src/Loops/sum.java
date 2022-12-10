public class sum {
    public static void main(String[] args) {
        int n = 10;
        int i = 0;
        int sum = 10;
        while (n >= 0) {
            sum += i;
            i++;
            n--;
        }
        System.out.println(sum);
    }

}
