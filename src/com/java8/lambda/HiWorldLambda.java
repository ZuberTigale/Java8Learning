package com.java8.lambda;

public class HiWorldLambda {
    public static void main(String[] args) {
        //Using Lambda to call HiWorld
        HiWorld hi =  ()->{
            return "Hi World from Lambda";
        };
        //both are same we don't need to return keyword java will understand
        HiWorld hi1 = ()-> "HI world lambda";
        System.out.println(hi.HiWorld());
        System.out.println(hi1.HiWorld());
    }
}
