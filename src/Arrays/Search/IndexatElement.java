package Search;

public class IndexatElement {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40 };
        int ele = 40;
        int ind = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ele) {
                ind = i;
                break;
            }
        }
        System.out.println("Index at element :- " + ind);
    }
}
