package Multithreading.singletonClassDemo;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Demo{

    public static void main(String[] args) {
        SingletonDemo d1= SingletonDemo.getInstance();
        System.out.println(d1);
        SingletonDemo d2= SingletonDemo.getInstance();
        System.out.println(d2);
        SingletonDemo d3= SingletonDemo.getInstance();
        System.out.println(d3);
        SingletonDemo d4= SingletonDemo.getInstance();
        System.out.println(d4);
    }
}