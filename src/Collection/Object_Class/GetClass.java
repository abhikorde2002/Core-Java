package Collection.Object_Class;

import Collection.List.Stack.Method;
// impo java.lang.reflect
public class GetClass {
    public static void main(String[] args) {
        Object o =new Object();
        Class c =o.getClass();

        System.out.println("Class name"+c.getName());
        java.lang.reflect.Method[] m= c.getDeclaredMethods();

        for(java.lang.reflect.Method m1:m){
              System.out.println(m1.getName());
        }
    }
}
