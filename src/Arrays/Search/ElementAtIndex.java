package Search;

public class ElementAtIndex {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 5 };
        int element = 0;
        int index = 2;
        for (int i = 0; i < arr.length; i++) {
            if (i == index) {
                element = arr[i];
                break;
            }
        }
        System.out.println("Array at Index :- " + element);
    }
}
