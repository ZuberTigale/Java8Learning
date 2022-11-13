package com.java8.funcprogramming;

import java.util.List;

public interface InstructorFactory {
    public  abstract Instructor getInstructor(String name, int yearsOfExperience, String title,
                                              String gender, boolean onlineCOurses, List<String> courses);

}
