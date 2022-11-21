package Search;

public class Average {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 5, 6, 7 };
        ave(arr);
    }

    static void ave(int arr[]) {
        int sum = 0;
        for (int a = 0; a < arr.length; a++) {
            sum = sum + arr[a];
        }
        double average = sum / arr.length;
        System.out.println("Average of array is :- " + average);
    }
}
