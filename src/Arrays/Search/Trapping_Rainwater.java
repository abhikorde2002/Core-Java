package Search;

public class Trapping_Rainwater {
    public static void main(String[] args) {
        int num[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(trapping_water(num));
    }

    static int trapping_water(int num[]) {
        int n = num.length;

        // Calculate left max bondary array

        int left_boundary[] = new int[n];
        left_boundary[0] = num[0];

        for (int i = 1; i < n; i++) {
            left_boundary[i] = Math.max(left_boundary[i - 1], num[i]);
        }

        // Calculate right max bondary array
        int right_max[] = new int[n];
        right_max[n - 1] = num[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            right_max[i] = Math.max(num[i], right_max[i + 1]);
        }
        int trappede = 0;

        // loop
        for (int i = 0; i < n; i++) {
            int water = Math.min(left_boundary[i], right_max[i]);
            trappede += water - num[i];
        }
        return trappede;
    }
}
