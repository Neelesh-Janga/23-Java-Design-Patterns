package com.neelesh.design.patterns.creational.singleton;

public class Singleton {
    private static Singleton singletonInstance = null;
    private Singleton(){}

    public static Singleton getInstance() {
        if (singletonInstance == null) {
            singletonInstance = new Singleton();
            return singletonInstance;
        }

        return singletonInstance;
    }
}
