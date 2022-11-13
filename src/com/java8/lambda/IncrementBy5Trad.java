package com.java8.lambda;

public class IncrementBy5Trad implements  IncrementNumBy5Interface{

    @Override
    public int incrementBy5(int a) {
        return a + 5;
    }

    public static void main(String[] args) {
        IncrementNumBy5Interface in = new IncrementBy5Trad();

        System.out.println(in.incrementBy5(3));
    }
}
