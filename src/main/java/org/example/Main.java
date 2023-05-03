package org.example;

public class Main {
    public static void main(String[] args) {

        SecondClass secondClass = new SecondClass();
        secondClass.adding(1, 1);
        secondClass.text();

        System.out.println(add(5, 2));

        //Remote repo + Local now
        //here will accure merge conflict
        if (multiplyNum(4,2, 1) > 5){
            System.out.println("Great");
        }else{
            System.out.println("Bad");
        }
    }

    //Local repo + Remote repo
    public static int multiplyNum(int a, int b, int c) {
        int t;
        t = a * b * c;
        return t;
        }

        public static int add(int b, int a) {
            int t;
            t = b + a;
            return t;
        }
}
