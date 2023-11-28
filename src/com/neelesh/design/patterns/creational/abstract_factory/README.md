**Link to Medium Post:** <a href = "https://medium.com/@Neelesh-Janga/abstract-factory-pattern-in-java-a-comprehensive-guide-560d9016a92b">Abstract Factory Pattern in Java</a>
<hr>

# Abstract Factory Pattern in Java: A Comprehensive Guide

## Introduction to Design Patterns

Design patterns are reusable solutions to common problems that occur during software development. They provide a way to solve issues in a flexible and elegant manner, making code more maintainable and scalable. One such design pattern is the Abstract Factory Pattern, which falls under the category of creational design patterns.

## Creational Design Patterns

Creational design patterns deal with object creation mechanisms, attempting to create objects in a manner suitable to the situation. These patterns abstract the instantiation process, making a system independent of how its objects are created, composed, and represented.

## Abstract Factory Pattern

The Abstract Factory Pattern provides an interface for creating families of related or dependent objects without specifying their concrete classes. It encapsulates a group of individual factories with a common theme, allowing clients to use the interface to create objects without being concerned about the specific implementation details.

### Components of the Abstract Factory Pattern

1. **Abstract Factory Interface:** This declares the creation methods for the abstract product objects.

2. **Concrete Factories:** These are classes that implement the abstract factory interface. They are responsible for creating a family of related products.

3. **Abstract Product Interface:** This declares the interface for a type of product object.

4. **Concrete Products:** These are the classes that implement the abstract product interface. They define the properties and behaviors of the product objects.

### Understanding the Code

Let's delve into a practical example of the Abstract Factory Pattern using Java. The provided code demonstrates a mobile phone manufacturing scenario where different components, such as the camera and display, are created based on the type of mobile device (iOS or Android).

#### Code Overview

- **Interfaces:** Two interfaces, `ICamera` and `IDisplay`, define the abstract product types for the camera and display components.

- **Exception Class:** `InvalidMobile` is an exception class that can be thrown when an invalid mobile type is encountered.

- **Concrete Implementations:** `OnePlusCamera`, `OnePlusDisplay`, `IPhoneCamera`, and `IPhoneDisplay` are concrete implementations of the camera and display components for OnePlus and iPhone devices.

- **Mobile Class:** The `Mobile` class represents a mobile phone and is responsible for using the abstract factory to create camera and display components.

- **Factory Interfaces:** `IMobileComponentFactory` declares the abstract factory interface, and `IPhoneFactory` and `OnePlusFactory` are concrete factory implementations.

- **Testing the Pattern:** In the `AbstractFactoryTest` class, a mobile phone is created based on the specified operating system, and its functionalities are tested.

### Step-by-Step Explanation

1. **Interfaces for Products (`ICamera` and `IDisplay`):**
   
    ```java
    public interface ICamera {
        void captureImage();
        void recordVideo(String resolution);
    }

    public interface IDisplay {
        void displaySettings(int fps);
    }
    ```

    These interfaces define the abstract product types for the camera and display components. Any concrete implementation of a camera or display must adhere to these interfaces.

2. **Exception Class (`InvalidMobile`):**

    ```java
    public class InvalidMobile extends Exception {
        @Override
        public String getMessage() {
            return "Mobile doesn't exist";
        }
    }
    ```

    The `InvalidMobile` class is an exception class that is thrown when an attempt is made to create a mobile with an invalid type.

3. **Concrete Implementations of Products (`OnePlusCamera`, `OnePlusDisplay`, `IPhoneCamera`, `IPhoneDisplay`):**

    ```java
    public class OnePlusCamera implements ICamera {
        // Implementation of methods
    }

    public class OnePlusDisplay implements IDisplay {
        // Implementation of methods
    }

    public class IPhoneCamera implements ICamera {
        // Implementation of methods
    }

    public class IPhoneDisplay implements IDisplay {
        // Implementation of methods
    }
    ```

    These classes implement the `ICamera` and `IDisplay` interfaces, providing concrete functionality for OnePlus and iPhone camera and display components.

4. **Mobile Class (`Mobile`):**

    ```java
    public class Mobile {
        private IDisplay display;
        private ICamera camera;

        private Mobile() {
            // private constructor to enforce creation through a factory
        }

        public Mobile(IMobileComponentFactory mobileComponentFactory) {
            // Constructor that takes a factory and creates camera and display components
        }

        // Methods for using camera and display functionalities
    }
    ```

    The `Mobile` class represents a mobile phone and is responsible for using the abstract factory to create camera and display components.

5. **Factory Interfaces (`IMobileComponentFactory`):**

    ```java
    public interface IMobileComponentFactory {
        ICamera createCamera();
        IDisplay createDisplay();
    }
    ```

    The `IMobileComponentFactory` interface declares the abstract factory methods for creating camera and display components.

6. **Concrete Factory Implementations (`IPhoneFactory`, `OnePlusFactory`):**

    ```java
    public class IPhoneFactory implements IMobileComponentFactory {
        // Implementation of factory methods
    }

    public class OnePlusFactory implements IMobileComponentFactory {
        // Implementation of factory methods
    }
    ```

    These classes implement the `IMobileComponentFactory` interface, providing concrete implementations for creating camera and display components for iPhone and OnePlus devices.

7. **Testing the Pattern (`AbstractFactoryTest`):**

    ```java
    public class AbstractFactoryTest {
        public static void main(String[] args) throws InvalidMobile {
            // Code for testing the abstract factory pattern
        }
    }
    ```

    In this class, a mobile phone is created based on the specified operating system, and its functionalities are tested.

## Conclusion

The Abstract Factory Pattern is a powerful design pattern that promotes flexibility and maintainability in software development. It allows for the creation of families of related objects without specifying their concrete classes, making it easier to introduce new variants of products.

In the provided example, the code structure demonstrates the separation of product interfaces, concrete product implementations, and factory interfaces. The `Mobile` class acts as a client that relies on abstract factories to create concrete product instances.

By understanding and implementing the Abstract Factory Pattern, developers can design systems that are adaptable to changing requirements, making it a valuable tool in the software design toolbox.
