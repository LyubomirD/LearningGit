package org.example;

public class Main {
    public static void main(String[] args) {

        SecondClass secondClass = new SecondClass();
        secondClass.adding(1, 1);
        secondClass.text();

        System.out.println(add(5, 2));
        
        //here will accure merge conflict
        if (multiplyNum(4,2) > 5){
            System.out.println("Great");
        }else{
            System.out.println("Bad");
        }
        
        
    }

    public static int add(int b, int a) {
        int t;
        t = b + a;
        return t;
    }
    
    // here will accure merge conflict too
    public static int multiplyNum(int a, int b){
        int c;
        c = a * b;
        return c;
    }
}
