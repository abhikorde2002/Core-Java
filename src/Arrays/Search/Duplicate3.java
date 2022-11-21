package Search;

public class Duplicate3 {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 40, 20 };
        int index = 0;
        int result[] = new int[arr.length - 1];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    index = i;
                    break;
                }
                result[i] = arr[i];
            }
        }
        for (int i = index; i < result.length; i++) {
            result[i] = arr[i + 1];
        }
        for (int a : result) {
            System.out.println(a);
        }
    }
}
