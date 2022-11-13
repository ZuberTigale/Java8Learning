package com.java8.funcprogramming;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> c =(x)-> System.out.println(x.length()+" and x is "+x);
        c.accept("We are learning java 8");
        //Consumer with block statement
        Consumer<Integer> d=(x)->{
            System.out.println("x*x = "+x*x);
            System.out.println("x/x = "+x/x);
        };
        d.accept(10);
    }
}
