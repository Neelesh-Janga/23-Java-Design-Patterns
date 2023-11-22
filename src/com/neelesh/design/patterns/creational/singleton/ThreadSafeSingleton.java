package com.neelesh.design.patterns.creational.singleton;

import java.io.Serializable;

public class ThreadSafeSingleton implements Serializable {
    private static final long UUID = 1L;
    private static ThreadSafeSingleton singletonInstance;

    private ThreadSafeSingleton(){}

    public static ThreadSafeSingleton getInstance() {
        if (singletonInstance == null) {
            synchronized (ThreadSafeSingleton.class){
                if(singletonInstance == null) singletonInstance = new ThreadSafeSingleton();
            }
        }
        return singletonInstance;
    }

    public static long getUuid() {return UUID;}
}
