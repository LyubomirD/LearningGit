package org.example;

public class Main {
    public static void main(String[] args) {

        SecondClass secondClass = new SecondClass();
        secondClass.adding(1, 1);
        secondClass.text();

        System.out.println(add(5, 2));
        System.out.println(divideNum(4,2));
    }

    public static int add(int b, int a) {
        int t;
        t = b + a;
        return t;
    }
    
    public static int divideNum(int a, int b){
        int c;
        c = a / b;
        return c;
    }

    //solved merge conflict after merging branches ?
}
