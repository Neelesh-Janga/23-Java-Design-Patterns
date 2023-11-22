package com.neelesh.design.patterns.creational.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SingletonTest {

    public static void main(String[] args) {
//        Singleton object1 = Singleton.getInstance();
//        Singleton object2 = Singleton.getInstance();

        EagerSingleton object1 = EagerSingleton.getInstance();
        EagerSingleton object2 = EagerSingleton.getInstance();

        if(object1 == object2)
            System.out.println("Both objects are same");
        else
            System.out.println("Both objects are different");
    }
}
