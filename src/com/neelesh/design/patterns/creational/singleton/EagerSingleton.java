package com.neelesh.design.patterns.creational.singleton;

public class EagerSingleton {
    private static EagerSingleton singletonInstance = new EagerSingleton();

    private EagerSingleton() {
        System.out.println("Eager Singleton Instance Created Successfully!");
    }

    public static EagerSingleton getInstance() {
        return singletonInstance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
