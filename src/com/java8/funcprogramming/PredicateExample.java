package com.java8.funcprogramming;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        //If number>10 return true or false
        Predicate<Integer> p1 = (i)-> i>10;
        System.out.println(p1.test(100));
        //i>10 &number is even nuber(i%2==0)
        Predicate<Integer> p2=(i)->i%2==0;
        System.out.println(p1.and(p2).test(20));
        //i>10 or number is even(i%2==0)
        System.out.println(p1.or(p2).test(4));
        //i>0 and number is odd i%2!=0
        System.out.println(p1.and(p2.negate()).test(33));
    }
}
