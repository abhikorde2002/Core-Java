package Search;

public class Duplicate {
    public static void main(String[] args) {
        int num[] = { 1, 2, 3, 4, 5, 6, 6, 2 };
        System.out.println(duplic(num));
        dupli(num);
        duplic1(num);
    }

    static void dupli(int arr[]) {
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] == arr[j + 1]) {
                    flag = true;
                }
            }

        }
        System.out.println(flag ? "Duplicate" : "Not Duplicate");

    }

    static int duplic(int arr[]) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans = ans ^ arr[i] ^ i;

        }
        return ans;
    }

    static void duplic1(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(j);

                }
            }

        }

    }
}
