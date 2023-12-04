package com.neelesh.design.patterns.creational.singleton;

public class EagerSingleton {
    private static EagerSingleton singletonInstance = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return singletonInstance;
    }
}
