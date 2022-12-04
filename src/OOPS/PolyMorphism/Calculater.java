package OOPS.PolyMorphism;

class Calculater {
    public static void main(String[] args) {
        sum(22, 23);
        sum(23, 2);
    }

    static void sum(int a, int b) {
        System.out.println(a + b);
    }

    static void sum(float a, float b) {
        System.out.println(a + b);
    }
}