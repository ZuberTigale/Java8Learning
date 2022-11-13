package com.java8.lambda;

public class RunnableExample {
    public static void main(String[] args) {
        //
        Runnable run = new Runnable() {
            @Override
            public void run() {
                int sum=0;
                for(int i =0;i<10;i++)
                    sum+=i;
                System.out.println("Trad way"+sum);
            }
        };
        new Thread(run).start();
        //Implement Lamda way
        Runnable run1= ()->{
            int sum=0;
            for(int i =0;i<10;i++)
                sum+=i;
            System.out.println("Lambda way "+sum);
        };
        new Thread(run1).start();

        //Lambda with Thread
        new Thread( ()->{
            int sum=0;
            for(int i =0;i<10;i++)
                sum+=i;
            System.out.println("Thread with Lambda way "+sum);
        }).start();
    }
}
