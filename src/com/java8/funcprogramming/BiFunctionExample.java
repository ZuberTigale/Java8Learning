package com.java8.funcprogramming;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionExample {
    public static void main(String[] args) {
        //BiFunction 2 inputs List<Instructor> and second is predicate which will filter if instructor
        //has online courses and return a map of <String,Integer> string is name and Integer is year of exp
        Predicate<Instructor> p1=(i)->i.isOnlineCourses()==true;
        BiFunction<List<Instructor>, Predicate<Instructor>, Map<String, Integer>> biFunction=((instructors, predicateFunction)->{
            Map<String,Integer> map = new HashMap<>();
            instructors.forEach((instructor -> {
                if(predicateFunction.test(instructor)){
                    map.put(instructor.getName(),instructor.getYearsOfExperience());
                }
            }));
            return map;
        });
        System.out.println(biFunction.apply(Instructors.getAll(),p1));
    }
}
