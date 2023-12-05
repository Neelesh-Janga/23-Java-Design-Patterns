package com.neelesh.design.patterns.creational.singleton.multithreading;


import com.neelesh.design.patterns.creational.singleton.ThreadSafeSingleton;

public class ThreadA implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++){
            System.out.println("ThreadA: " + ThreadSafeSingleton.getInstance());
        }
        System.out.println("From ThreadA: Thread Entry Count = " + ThreadSafeSingleton.threadEntryCount);
    }
}
