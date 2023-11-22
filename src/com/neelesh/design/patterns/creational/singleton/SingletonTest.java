package com.neelesh.design.patterns.creational.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class SingletonTest {

    public static void main(String[] args) {
//        Singleton object1 = Singleton.getInstance();
//        Singleton object2 = Singleton.getInstance();

//        EagerSingleton object1 = EagerSingleton.getInstance();
//        EagerSingleton object2 = EagerSingleton.getInstance();

//        ThreadSafeSingleton object1 = ThreadSafeSingleton.getInstance();
//        ThreadSafeSingleton object2 = ThreadSafeSingleton.getInstance();

//        ThreadSafeSingleton object1 = ThreadSafeSingleton.getInstance();
//        ThreadSafeSingleton object2 = ThreadSafeSingleton.getInstance();

//        SerializationSafeSingleton object1 = SerializationSafeSingleton.getInstance();
//        SerializationSafeSingleton object2 = SerializationSafeSingleton.getInstance();

//        if(object1 == object2)
//            System.out.println("Both objects are same before serializing");
//        else
//            System.out.println("Both objects are different before serializing");

        try{
//            checkSerializationAndDeserialization(object1);
//            checkForReflectionAPI();
            checkForReflectionAPIV1();
        }catch (Exception e){
            System.out.println("Exception: " + e.getMessage());
        }
    }

    private static void checkSerializationAndDeserialization(ThreadSafeSingleton object1) throws Exception{
        // Serializing object1 to object1.obj
        ObjectOutputStream objectOutputStream =
                new ObjectOutputStream(new FileOutputStream("src/com/neelesh/design/patterns/creational/singleton/serialized_objects/object.obj"));

        objectOutputStream.writeObject(object1);

        objectOutputStream.close();

        // De-Serializing object1 from object1.obj
        ObjectInputStream objectInputStream =
                new ObjectInputStream(new FileInputStream("src/com/neelesh/design/patterns/creational/singleton/serialized_objects/object.obj"));

        ThreadSafeSingleton deserializedObject = (ThreadSafeSingleton) objectInputStream.readObject();

        objectInputStream.close();

        // Verification
        if(deserializedObject.hashCode() != object1.hashCode())
            System.out.println("Serialized and Deserialized objects are two different copies after deserializing");
        else
            System.out.println("Serialized and Deserialized objects are same copies after deserializing");

        System.out.println("Before serializing: " + object1.hashCode());
        System.out.println("After de-serializing: " + deserializedObject.hashCode());
    }

    private static void checkSerializationAndDeserialization(SerializationSafeSingleton object1) throws Exception{
        // Serializing object1 to object1.obj
        ObjectOutputStream objectOutputStream =
                new ObjectOutputStream(new FileOutputStream("src/com/neelesh/design/patterns/creational/singleton/serialized_objects/object.obj"));

        objectOutputStream.writeObject(object1);

        objectOutputStream.close();

        // De-Serializing object1 from object1.obj
        ObjectInputStream objectInputStream =
                new ObjectInputStream(new FileInputStream("src/com/neelesh/design/patterns/creational/singleton/serialized_objects/object.obj"));

        SerializationSafeSingleton deserializedObject = (SerializationSafeSingleton) objectInputStream.readObject();

        objectInputStream.close();

        // Verification
        if(deserializedObject.hashCode() != object1.hashCode())
            System.out.println("Serialized and Deserialized objects are two different copies after deserializing");
        else
            System.out.println("Serialized and Deserialized objects are same copies after deserializing");

        System.out.println("Before serializing: " + object1.hashCode());
        System.out.println("After de-serializing: " + deserializedObject.hashCode());
    }

    private static void checkForReflectionAPI() throws Exception{
        Constructor[] constructors = SerializationSafeSingleton.class.getDeclaredConstructors();
        Constructor constructor = constructors[0];
        constructor.setAccessible(true);

        SerializationSafeSingleton s1 = (SerializationSafeSingleton) constructor.newInstance();
        SerializationSafeSingleton s2 = (SerializationSafeSingleton) constructor.newInstance();

        if(s1 != s2) {
            System.out.println("Constructor is now exposed so it's not a singleton behaviour");
        }
    }

    private static void checkForReflectionAPIV1() throws Exception{
        Constructor[] constructors = EnumSingleton.class.getDeclaredConstructors();
        Constructor constructor = constructors[0];
        constructor.setAccessible(true);

        try{
            EnumSingleton s1 = (EnumSingleton) constructor.newInstance();
            EnumSingleton s2 = (EnumSingleton) constructor.newInstance();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        EnumSingleton.ENUM_SINGLETON_INSTANCE.display();
    }
}
