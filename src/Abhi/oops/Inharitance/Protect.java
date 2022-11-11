package Abhi.oops.Inharitance;

import Abhi.oops.Encapsulation.Protected;

public class Protect extends Protected {
    public Protect(int Id,String Name){
        super(Id,Name);
    }

    public static void main(String[] args) {
        Protect protect= new Protect(2,"Abhi");
        System.out.println("ID number:- "+ protect.Id);
        System.out.println("Name:-"+protect.name);
    }
}
