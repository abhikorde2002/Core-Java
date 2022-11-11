package FinalKeyword;

final class Finalclass {
    //If you create final class no one can extract that class.

    public void show(){
        System.out.println("Its final class.");
    }

    public static void main(String[] args) {
        Finalclass finalclass = new Finalclass();
        finalclass.show();
    }
}
