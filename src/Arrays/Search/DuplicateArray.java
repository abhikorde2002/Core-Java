package Search;

import java.util.Arrays;

public class DuplicateArray {
    public static void main(String[] args) {
        int[] array = { 10, 20, 20, 23, 44 };
        boolean flag = false;
        int index = 0;
        int[] result = new int[array.length - 1];
        Arrays.sort(array);
        for (int j = 0; j < array.length - 1; j++) {
            if (array[j] == array[j + 1]) {
                flag = true;
                index = j;
                break;
            }
            result[j] = array[j];
        }
        for (int i = index; i < result.length; i++) {
            result[i] = array[i + 1];
        }
        for (int a : result) {
            System.out.println(a);
        }

    }
}
