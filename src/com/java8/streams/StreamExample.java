package com.java8.streams;

import com.java8.funcprogramming.Instructor;
import com.java8.funcprogramming.Instructors;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        //creating a map of name and courses of instructors who teaches online and have more than
        // 10 years of experience

        Predicate<Instructor> p1=(i)->i.isOnlineCourses();
        Predicate<Instructor> p2=(i)->i.getYearsOfExperience()>10;

        List<Instructor> list= Instructors.getAll();
        Map<String, List<String>> map = list.stream()
                                        .peek(s-> System.out.println(s))  // to debug stream at this point
                                        .filter(p1)
                                        .filter(p2)
                                        .collect(Collectors.toMap(Instructor::getName,   // this and below line works same
                                        instructor -> instructor.getCourses()));
        System.out.println(map);
    }
}
