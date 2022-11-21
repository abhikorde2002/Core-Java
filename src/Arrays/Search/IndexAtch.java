package Search;

public class IndexAtch {
    public static void main(String[] args) {
        char arr[] = { 'a', 'b', 'c', 'd' };
        char ch = 'c';
        int ind = 0;
        char el = ' ';
        int Index = 3;
        for (int i = 0; i < arr.length; i++) {
            if (ch == arr[i]) {
                ind = i;
                break;
            }
        }
        System.out.println("Index at ch :- " + ind);

        for (int i = 0; i < arr.length; i++) {
            if (Index == i) {
                ch = arr[i];
                break;
            }
        }
        System.out.println("Character at " + Index + " is " + ch);
    }

}
