package com.neelesh.design.patterns.creational.singleton;

import java.io.Serial;
import java.io.Serializable;

public class SerializationSafeSingleton implements Serializable {
    private static volatile SerializationSafeSingleton singletonInstance;

    private SerializationSafeSingleton() {
    }

    public static SerializationSafeSingleton getInstance() {
        synchronized (SerializationSafeSingleton.class) {
            if (singletonInstance == null) singletonInstance = new SerializationSafeSingleton();
        }
        return singletonInstance;
    }

    /*
        @Serial lets us declare on those fields and methods that are part of serialization mechanism
    */
    @Serial
    protected Object readResolve() {
        return singletonInstance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
