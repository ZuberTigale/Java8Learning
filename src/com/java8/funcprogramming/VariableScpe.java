package com.java8.funcprogramming;

import java.util.List;
import java.util.function.IntConsumer;

public class VariableScpe {
    static  int k=0;
    public static void main(String[] args) {
        int b=10; //Local variable
//        IntConsumer intConsumer=(b)-> System.out.println(a*10); Error can not have same name
        IntConsumer intConsumer=(a)-> System.out.println(a*10);

//        int k=0;
        List<Instructor> instructors = Instructors.getAll();
        instructors.forEach(instructor -> {
//            System.out.println(instructor+k++); we cannot modify k variable in lambda
            System.out.println(instructor+" "+k);
        });
//        k=6; even if modify local var here it will give an error
        k++; // static and instance var there is no isssue we can modify it
    }
}
