package org.example;

public class Main {
    public static void main(String[] args) {

        SecondClass secondClass = new SecondClass();
        secondClass.adding(1, 1);
        secondClass.text();

        System.out.println(add(5, 2));

        //Local repo
        System.out.println(multiplyNum(1,2,4));
    }

    public static int add(int b, int a) {
        int t;
        t = b + a;
        return t;
    }

    //Local repo
    public static int multiplyNum(int a, int b, int c){
        int t;
        t = a * b * c;
        return t;
    }
}
