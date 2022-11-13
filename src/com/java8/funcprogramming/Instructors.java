package com.java8.funcprogramming;

import java.util.Arrays;
import java.util.List;

public class Instructors {
    public static List<Instructor> getAll(){
        Instructor instructor1 = new Instructor("Mike",10,"Software Developer", "male"
        ,true, Arrays.asList("Java Programming","C++ Programming","Python Programming"));
        Instructor instructor2 = new Instructor("Jon",6,"Engineer", "female"
                ,false, Arrays.asList("Multi-Threaded Programming","CI/CD","Unit Testing"));
        Instructor instructor3 = new Instructor("Gene",5,"Manager", "male"
                ,false, Arrays.asList("C Programming","C++ Programming","React Native"));
        Instructor instructor4 = new Instructor("Zuber",5,"Software Developer", "male"
                ,true, Arrays.asList("Java Programming","Angular Programming","Python Programming"));
        Instructor instructor5 = new Instructor("Syed",15,"Principal Engineer", "male"
                ,true, Arrays.asList("Java Programming","C++ Programming","Python Programming"));
        List<Instructor> list = Arrays.asList(instructor1,instructor2,instructor3,instructor4,instructor5);
        return list;
    }
}
