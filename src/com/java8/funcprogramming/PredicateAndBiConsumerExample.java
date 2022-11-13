package com.java8.funcprogramming;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

public class PredicateAndBiConsumerExample {
    public static void main(String[] args) {
        List<Instructor> instructors= Instructors.getAll();
        //all instructor who teaches online
        Predicate<Instructor> p1=(i)->i.isOnlineCourses()==true;
        //all instructor who has experience > 10
        Predicate<Instructor> p2=(i)->i.getYearsOfExperience()>10;

        // prints name and courses
        BiConsumer<String, List<String>> biConsumer= (name, courses)->
                System.out.println("Name "+name+" Courses : "+courses);
        instructors.forEach((instructor -> {
            if(p1.and(p2).test(instructor))
                biConsumer.accept(instructor.getName(), instructor.getCourses());
        }));
    }
}
