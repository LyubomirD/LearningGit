package org.example;

public class SecondClass implements Interface {

    public int adding(int a, int b) {
        int c = a + b;
        return c;
    }

    public String text() {
        return "Hello World";
    }

    @Override
    public int multiplies(int a, int b) {
        int g = a * b;
        return g;
    }
}
