package com.java8.funcprogramming;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample2 {
    public static void main(String[] args) {
        List<Instructor> instructors = Instructors.getAll();
        //Print out name and gender of instructors
        BiConsumer<String, String> biConsumer=(name,gender)-> System.out.println("Name is: "+ name
        +" gender is : "+gender);
        instructors.forEach(instructor ->
                biConsumer.accept(instructor.getName(),instructor.getGender()));
        //print out name and list of courses
        BiConsumer<String,List<String>> biConsumer1=(name,courses)-> System.out.println("Name is: "+ name
                +" courses is : "+courses);
        instructors.forEach(instructor -> {
            biConsumer1.accept(instructor.getName(),instructor.getCourses());
        });
        System.out.println("-------------------------");
        //print out name and gender of instructor who teaches online
        instructors.forEach(instructor -> {
            if(instructor.isOnlineCourses()){
                biConsumer.accept(instructor.getName(),instructor.getGender());
            }
        });
    }
}
