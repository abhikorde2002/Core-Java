package Collection.List.Stack;

import java.util.Stack;

public class Method {
    public static void main(String[] args) {
        Stack s = new Stack<>();
        s.add("Apple");
        s.add("Mango");
        s.add("Banana");
        s.push("Apple");
        System.out.println(s);

        System.out.println("peek"+s.peek());
        System.out.println(s.push("Goa"));
        System.out.println(s.pop());
        System.out.println(s.search("Mango"));
        System.out.println(s.empty());
        System.out.println(s);
    }
}
