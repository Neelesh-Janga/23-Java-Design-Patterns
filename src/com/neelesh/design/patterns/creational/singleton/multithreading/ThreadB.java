package com.neelesh.design.patterns.creational.singleton.multithreading;

import com.neelesh.design.patterns.creational.singleton.ThreadSafeSingleton;

public class ThreadB implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++){
            System.out.println("ThreadB: " + ThreadSafeSingleton.getInstance());
        }
        System.out.println("From ThreadB: Thread Entry Count = " + ThreadSafeSingleton.threadEntryCount);
    }
}
