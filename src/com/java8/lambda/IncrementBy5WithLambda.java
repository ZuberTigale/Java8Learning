package com.java8.lambda;

public class IncrementBy5WithLambda {
    public static void main(String[] args) {
        IncrementNumBy5Interface in = (x)-> x + 5;
        System.out.println(in.incrementBy5(2));
    }
}
