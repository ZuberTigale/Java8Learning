package com.java8.lambda;

public class ConcatLambda {
    public static void main(String[] args) {
        ConcatenateInterface concatenateInterface = (a,b)-> a + " "+ b;
//        ConcatLambda concatLambda = new ConcatLambda();
        System.out.println(concatenateInterface.sConcat("Hi","World"));
    }


}
