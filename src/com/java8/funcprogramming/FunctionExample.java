package com.java8.funcprogramming;

import java.util.Locale;
import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<Integer, Double> sqrt=n->Math.sqrt(n);
        System.out.println("Square root of 64 "+sqrt.apply(64));
        System.out.println("Square root of 81 "+sqrt.apply(81));

        Function<String, String> toLow=s-> s.toLowerCase();
        System.out.println("Lower case of ZUBER is "+toLow.apply("ZUBER"));
        Function<String, String> concat=s->s.concat(" IN JAVA");
        System.out.println(toLow.andThen(concat).apply("PROGRAMMING"));

        System.out.println(toLow.compose(concat).apply("PROGRAMMING"));
    }
}
