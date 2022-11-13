package com.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamVsCollectionExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Tasmiya");
        names.add("Muhammad");
        names.add("Khadeejah");
        names.add("Ahmed");
        names.add("Ron");
        System.out.println("------------");
        System.out.println(names);

        names.remove("Ron");
        System.out.println("------------");
        System.out.println(names);
        // Collection traverse externally
        for (String name:names){
            System.out.println(name);
        }

        Stream<String> namesStream = names.stream();
        //Stream traverse internally
        namesStream.forEach(System.out::println);
    }
}

