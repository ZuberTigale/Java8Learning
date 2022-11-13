package com.java8.funcprogramming;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class BiPredicateExample {
    public static void main(String[] args) {
        List<Instructor> instructors= Instructors.getAll();
        //all instructor who teaches online has experience > 10
        BiPredicate<Boolean,Integer> p3 = (online, experience)->online==true && experience>10;

        // prints name and courses
        BiConsumer<String, List<String>> biConsumer= (name, courses)->
                System.out.println("Name "+name+" Courses : "+courses);
        instructors.forEach((instructor -> {
            if(p3.test(instructor.onlineCourses,instructor.getYearsOfExperience()))
                biConsumer.accept(instructor.getName(), instructor.getCourses());
        }));
    }
}
