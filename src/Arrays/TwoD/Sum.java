package TwoD;

public class Sum {
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        sum(arr);
    }

    static void sum(int arr[][]) {
        int Sum = 0;
        for (int j = 0; j < arr[0].length - 1; j++) {
            Sum += arr[1][j];
        }
        System.out.println(Sum);
    }
}
