package com.neelesh.design.patterns.creational.singleton;

public class ThreadSafeSingleton {
    public static int threadEntryCount = 0; // Use this field to test multithreading
    private static volatile ThreadSafeSingleton singletonInstance;

    private ThreadSafeSingleton() {
    }

    public static ThreadSafeSingleton getInstance() {
        synchronized (ThreadSafeSingleton.class) {
            if (singletonInstance == null) {
                threadEntryCount++; // Use this field to test multithreading
                singletonInstance = new ThreadSafeSingleton();
            }
        }
        return singletonInstance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
