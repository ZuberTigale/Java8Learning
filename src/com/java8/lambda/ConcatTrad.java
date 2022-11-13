package com.java8.lambda;

public class ConcatTrad implements ConcatenateInterface{

    @Override
    public String sConcat(String a, String b) {
        return a + " " + b;
    }

    public static void main(String[] args) {
        ConcatTrad concatTrad = new ConcatTrad();
        concatTrad.sConcat("Hi","World");
    }
}
