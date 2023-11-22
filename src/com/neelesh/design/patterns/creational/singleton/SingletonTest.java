package com.neelesh.design.patterns.creational.singleton;

public class SingletonTest {

    public static void main(String[] args) {
        Singleton object1 = Singleton.getInstance();
        Singleton object2 = Singleton.getInstance();

        if(object1 == object2)
            System.out.println("Both objects are same");
        else
            System.out.println("Both objects are different");
    }
}
