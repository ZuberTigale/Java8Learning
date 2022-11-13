package com.java8.funcprogramming;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample2 {
    public static void main(String[] args) {
    List<Instructor> instructors = Instructors.getAll();
    //Looping through all the instructor and printing out the values of instructor
    Consumer<Instructor> c1 = (s1)-> System.out.println(s1);
    instructors.forEach(c1);
        System.out.println("---------------------------");
    //Looping through all the instructor and printing out the Name
        Consumer<Instructor> c2 = (s1)-> System.out.println(s1.getName());
        instructors.forEach(c2);
        System.out.println("----------------------");
        //Looping through all the instructor and printing out the Name and courses
        Consumer<Instructor> c3 = (s1)-> System.out.println(s1.getCourses());
        instructors.forEach(c2.andThen(c3));
        //Loop through all the instructor and printout their name depending on yars of experience>10
        System.out.println("--------------------------");
        instructors.forEach(s1 -> {
            if(s1.yearsOfExperience>10){
                c1.accept(s1);
            }
        });
        //Loop through all the instructors and printout name and years of experience
        //and teaches online
        System.out.println("---------");
        instructors.forEach(s1->{
            if(s1.yearsOfExperience>5 && !s1.isOnlineCourses())
                c1.andThen(c2).accept(s1);
        });
    }
}
