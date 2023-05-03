package org.example;

public class Main {
    public static void main(String[] args) {

        SecondClass secondClass = new SecondClass();
        secondClass.adding(1, 1);
        secondClass.text();
        
        

        System.out.println(divideNum(4,2));
        
        
        // we do not need secondClass for methods
  
    }
    
    public static int divideNum(int a, int b){
        int c;
        c = a / b;
        return c;
    }
}
