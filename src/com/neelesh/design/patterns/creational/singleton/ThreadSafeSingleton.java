package com.neelesh.design.patterns.creational.singleton;

import java.io.Serializable;

public class ThreadSafeSingleton implements Serializable {
    public static volatile int threadEntryCount = 0;
    private static ThreadSafeSingleton singletonInstance;

    private ThreadSafeSingleton() {
    }

    public static ThreadSafeSingleton getInstance() {
        if (singletonInstance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (singletonInstance == null) {
                    threadEntryCount++;
                    singletonInstance = new ThreadSafeSingleton();
                }
            }
        }
        return singletonInstance;
    }
}
