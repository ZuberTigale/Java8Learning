package com.java8.funcprogramming;

import java.util.Locale;
import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceExample {
    public static void main(String[] args) {
        Predicate<Instructor> p1= i -> i.isOnlineCourses();
        Predicate<Instructor> p2=Instructor::isOnlineCourses;

        Function<Integer, Double> sqrt=n->Math.sqrt(n);
        Function<Integer, Double> sqrt1 =Math::sqrt;

        Function<String, String> lowerCaseFunc=s->s.toLowerCase();
        Function<String, String> lowerCasefunc1=String::toLowerCase;

        System.out.println(sqrt.apply(81));
        System.out.println(sqrt1.apply(81));
        System.out.println(lowerCasefunc1.apply("LOWER"));
        System.out.println(lowerCaseFunc.apply("LOWER"));
    }
}
