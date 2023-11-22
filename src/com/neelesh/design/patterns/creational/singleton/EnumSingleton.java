package com.neelesh.design.patterns.creational.singleton;

public enum EnumSingleton {
    ENUM_SINGLETON_INSTANCE;

    public void display(){
        System.out.println("This is how we implement singleton design that is thread-safe, multithreading-safe and reflectionAPI-safe");
    }
}
