package com.java8.lambda;

public class HiWorldTrad implements HiWorld{
    @Override
    public String HiWorld() {
        return "HI World!!";
    }

    public static void main(String[] args) {
        HiWorldTrad hi = new HiWorldTrad();
        System.out.println(hi.HiWorld());
    }
}
