package org.example;

public class Main {
    public static void main(String[] args) {

        SecondClass secondClass = new SecondClass();
        secondClass.adding(1, 1);
        secondClass.text();
        
        secondClass.divide(5, 1);

        secondClass.divide(8, 7);

        System.out.println(add(5, 2));
    }

    public static int add(int b, int a) {
        int t;
        t = b + a;
        return t;
    }
}
