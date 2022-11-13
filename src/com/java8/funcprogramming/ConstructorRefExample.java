package com.java8.funcprogramming;

import java.util.Arrays;

public class ConstructorRefExample {
    public static void main(String[] args) {
        InstructorFactory instructorFactory = Instructor::new;
        Instructor instructor = instructorFactory.getInstructor("Mike",10,"Software Developer",
                "Male", true, Arrays.asList("Java","C++","Python"));
        System.out.println(instructor);
    }
}
