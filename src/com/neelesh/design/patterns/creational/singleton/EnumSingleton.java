package com.neelesh.design.patterns.creational.singleton;

public enum EnumSingleton {
    ENUM_SINGLETON_INSTANCE;

    private EnumSingleton() {
        System.out.println("Enum Singleton Instance Created Successfully!");
    }

    public void display() {
        System.out.println("This is how we implement singleton design that is thread-safe, serialization-safe and reflectionAPI-safe\n");
    }
}
