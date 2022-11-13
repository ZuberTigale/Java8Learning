package com.java8.funcprogramming;

import java.util.function.Predicate;

public class ConverToMethodRefExample {
    public static void main(String[] args) {
//        Predicate<Instructor> p2=(i)->i.yearsOfExperience>10;
        Predicate<Instructor> p2=ConverToMethodRefExample::greaterThan10YearsExperience;
        Instructors.getAll().forEach(instructor -> {
            if(p2.test(instructor))
                System.out.println(instructor);
        });
    }
    public static boolean greaterThan10YearsExperience(Instructor instructor){
        if (instructor.getYearsOfExperience()>10)
            return true;
        return false;
    }
}
