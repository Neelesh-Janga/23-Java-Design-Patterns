package com.neelesh.design.patterns.creational.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class SingletonTest {
    private static final String className = "com.neelesh.design.patterns.creational.singleton.";

    public static void main(String[] args) throws Exception {

        System.out.println("*** Lazy Singleton ***");
        lazySingletonTest();

        System.out.println("*** Eager Singleton ***");
        eagerSingletonTest();

        System.out.println("*** Serialization-Safe Singleton ***");
        serializationSafeSingletonTest();

        System.out.println("*** Testing for proper Reflection API Vulnerability for Serialization-Safe Singleton ***");
        serializationSafeSingletonReflectionAPITest();

        System.out.println("*** Testing for proper Reflection API Vulnerability for Enum Singleton ***");
        enumReflectionAPITest();

        System.out.println("*** Thread-Safe Singleton ***");
        threadSafeSingletonTest();
    }

    private static void lazySingletonTest() {
        System.out.print("Trying to load the class and see if instance is created: ");
        try {
            // Attempt to load the class
            Class.forName(className + "Singleton");
            System.out.println("Class '" + className + "Singleton" + "' is loaded.");
        } catch (ClassNotFoundException e) {
            System.out.println("Class '" + className + "Singleton" + "' is not loaded.");
        }

        System.out.print("Creating Lazy Singleton Objects: ");
        Singleton object1 = Singleton.getInstance();
        Singleton object2 = Singleton.getInstance();

        if (object1 == object2)
            System.out.println("Lazy Singleton - Both objects are same\n");
        else
            System.out.println("Lazy Singleton - Both objects are different\n");

    }

    private static void eagerSingletonTest() {
        System.out.print("Trying to load the class and see if instance is created: ");
        try {
            // Attempt to load the class
            Class.forName(className + "EagerSingleton");
            System.out.println("Class '" + className + "EagerSingleton" + "' is loaded.");
        } catch (ClassNotFoundException e) {
            System.out.println("Class '" + className + "EagerSingleton" + "' is not loaded.");
        }

        EagerSingleton object1 = EagerSingleton.getInstance();
        EagerSingleton object2 = EagerSingleton.getInstance();

        if (object1 == object2)
            System.out.println("Eager Singleton - Both objects are same\n");
        else
            System.out.println("Eager Singleton - Both objects are different\n");
    }

    private static void threadSafeSingletonTest() {
        ThreadSafeSingleton object1 = ThreadSafeSingleton.getInstance();
        ThreadSafeSingleton object2 = ThreadSafeSingleton.getInstance();

        if (object1 == object2)
            System.out.println("Thread-Safe Singleton - Both objects are same\n");
        else
            System.out.println("Thread-Safe Singleton - Both objects are different\n");

        // Test for thread safety - Uncomment the below line and check for "Thread Entry Count". If each thread has count = 1, then it's Thread safe
//        MyThread.execute();
    }

    private static void serializationSafeSingletonTest() {
        SerializationSafeSingleton object1 = SerializationSafeSingleton.getInstance();
        SerializationSafeSingleton object2 = SerializationSafeSingleton.getInstance();

        if (object1 == object2)
            System.out.println("Serialization-Safe Singleton - Both objects are same");
        else
            System.out.println("Serialization-Safe Singleton - Both objects are different");


        System.out.print("Testing for proper Serialization and De-Serialization of Serialization-Safe Singleton: ");
        try {
            checkSerializationAndDeserialization(object1);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
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

        System.out.println("Object HashCode before serializing: " + singleton.hashCode());
        System.out.println("Object HashCode after de-serializing: " + deserializedObject.hashCode() + "\n");
    }

    private static void serializationSafeSingletonReflectionAPITest() throws Exception {
        Constructor[] constructors = SerializationSafeSingleton.class.getDeclaredConstructors();
        Constructor constructor = constructors[0];
        constructor.setAccessible(true);

        SerializationSafeSingleton s1 = (SerializationSafeSingleton) constructor.newInstance();
        SerializationSafeSingleton s2 = (SerializationSafeSingleton) constructor.newInstance();

        if (s1 != s2) {
            System.out.println("Private Constructor is now exposed. Singleton behaviour is collapsed\n");
        } else {
            System.out.println("Private Constructor is not exposed. Singleton behaviour preserved\n");
        }
    }

    private static void enumReflectionAPITest() throws Exception {
        System.out.print("Trying to load the class and see if instance is created: ");
        try {
            // Attempt to load the class
            Class.forName(className + "EnumSingleton");
            System.out.println("Class '" + className + "EnumSingleton" + "' is loaded.");
        } catch (ClassNotFoundException e) {
            System.out.println("Class '" + className + "EnumSingleton" + "' is not loaded.");
        }

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
