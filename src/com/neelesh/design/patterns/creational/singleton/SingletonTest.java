package com.neelesh.design.patterns.creational.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class SingletonTest {

    public static void main(String[] args) {
        Singleton object1 = Singleton.getInstance();
        Singleton object2 = Singleton.getInstance();

        if (object1 == object2)
            System.out.println("Lazy Singleton - Both objects are same");
        else
            System.out.println("Lazy Singleton - Both objects are different");

        EagerSingleton object3 = EagerSingleton.getInstance();
        EagerSingleton object4 = EagerSingleton.getInstance();

        if (object3 == object4)
            System.out.println("Eager Singleton - Both objects are same");
        else
            System.out.println("Eager Singleton - Both objects are different");

        ThreadSafeSingleton object5 = ThreadSafeSingleton.getInstance();
        ThreadSafeSingleton object6 = ThreadSafeSingleton.getInstance();

        if (object5 == object6)
            System.out.println("Thread-Safe Singleton - Both objects are same");
        else
            System.out.println("Thread-Safe Singleton - Both objects are different");

        SerializationSafeSingleton object7 = SerializationSafeSingleton.getInstance();
        SerializationSafeSingleton object8 = SerializationSafeSingleton.getInstance();

        if (object7 == object8)
            System.out.println("Serialization-Safe Singleton - Both objects are same");
        else
            System.out.println("Serialization-Safe Singleton - Both objects are different");

        System.out.println("\n*** Testing for proper Serialization and De-Serialization of Thread-Safe Singleton***");
        try {
            checkSerializationAndDeserialization(object5);
        } catch (Exception e) {
            System.out.println("Failed to reconstruct object using De-Serialization\n");
        }

        System.out.println("*** Testing for proper Serialization and De-Serialization of Serialization-Safe & ReflectionAPI-Safe Singleton***");
        try {
            checkSerializationAndDeserialization(object7);

            System.out.println("\n*** Testing for proper Reflection API Vulnerability ***");
            checkForReflectionAPI();
            checkForReflectionAPIV1();
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    private static void checkSerializationAndDeserialization(ThreadSafeSingleton singleton) throws Exception {
        // Serializing singleton to objThreadSafeSingletonect1.obj
        ObjectOutputStream objectOutputStream =
                new ObjectOutputStream(new FileOutputStream("src/com/neelesh/design/patterns/creational/singleton/serialized_objects/ThreadSafeSingleton.obj"));

        objectOutputStream.writeObject(singleton);

        objectOutputStream.close();

        // De-Serializing singleton from ThreadSafeSingleton.obj
        ObjectInputStream objectInputStream =
                new ObjectInputStream(new FileInputStream("src/com/neelesh/design/patterns/creational/singleton/serialized_objects/ThreadSafeSingleton.obj"));

        ThreadSafeSingleton deserializedObject = (ThreadSafeSingleton) objectInputStream.readObject();

        objectInputStream.close();

        // Verification
        if (deserializedObject.hashCode() != singleton.hashCode())
            System.out.println("Serialized and Deserialized objects are two different copies after deserializing");
        else
            System.out.println("Serialized and Deserialized objects are same copies after deserializing");

        System.out.println("Before serializing: " + singleton.hashCode());
        System.out.println("After de-serializing: " + deserializedObject.hashCode());
    }

    private static void checkSerializationAndDeserialization(SerializationSafeSingleton singleton) throws Exception {
        // Serializing singleton to SerializationSafeSingleton.obj
        ObjectOutputStream objectOutputStream =
                new ObjectOutputStream(new FileOutputStream("src/com/neelesh/design/patterns/creational/singleton/serialized_objects/SerializationSafeSingleton.obj"));

        objectOutputStream.writeObject(singleton);

        objectOutputStream.close();

        // De-Serializing singleton from SerializationSafeSingleton.obj
        ObjectInputStream objectInputStream =
                new ObjectInputStream(new FileInputStream("src/com/neelesh/design/patterns/creational/singleton/serialized_objects/SerializationSafeSingleton.obj"));

        SerializationSafeSingleton deserializedObject = (SerializationSafeSingleton) objectInputStream.readObject();

        objectInputStream.close();

        // Verification
        if (deserializedObject.hashCode() != singleton.hashCode())
            System.out.println("Serialized and Deserialized objects are two different copies after deserializing");
        else
            System.out.println("Serialized and Deserialized objects are same copies after deserializing");

        System.out.println("Before serializing: " + singleton.hashCode());
        System.out.println("After de-serializing: " + deserializedObject.hashCode());
    }

    private static void checkForReflectionAPI() throws Exception {
        Constructor[] constructors = SerializationSafeSingleton.class.getDeclaredConstructors();
        Constructor constructor = constructors[0];
        constructor.setAccessible(true);

        SerializationSafeSingleton s1 = (SerializationSafeSingleton) constructor.newInstance();
        SerializationSafeSingleton s2 = (SerializationSafeSingleton) constructor.newInstance();

        if (s1 != s2) {
            System.out.println("Constructor is now exposed so it's not a singleton behaviour");
        }
    }

    private static void checkForReflectionAPIV1() throws Exception {
        Constructor[] constructors = EnumSingleton.class.getDeclaredConstructors();
        Constructor constructor = constructors[0];
        constructor.setAccessible(true);

        try {
            EnumSingleton s1 = (EnumSingleton) constructor.newInstance();
            EnumSingleton s2 = (EnumSingleton) constructor.newInstance();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        EnumSingleton.ENUM_SINGLETON_INSTANCE.display();
    }
}
