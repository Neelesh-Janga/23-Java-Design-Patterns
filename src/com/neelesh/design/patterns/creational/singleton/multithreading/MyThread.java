package com.neelesh.design.patterns.creational.singleton.multithreading;

public class MyThread {
    public static void execute() {
        Thread tA = new Thread(new ThreadA());
        Thread tB = new Thread(new ThreadB());
        Thread tC = new Thread(new ThreadC());

        tA.start();
        tB.start();
        tC.start();

        try{
            tA.join();
            tB.join();
            tC.join();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
