**Link to Medium Post:** <a href = "https://medium.com/@Neelesh-Janga/f3d1abe6fe8d">Singleton Design Patterns in Java</a>
<hr>


## Singleton Design Patterns in Java

![](https://cdn-images-1.medium.com/max/3840/1*AVa2JxCBjM_RuBCD0gZgwg.png)

## Overview of Singleton Design Pattern

The [Singleton Design Pattern](https://en.wikipedia.org/wiki/Singleton_pattern) is one of the creational design patterns, focusing on the instantiation of a class to ensure that only one instance of the class exists and provides a global point of access to that instance. This pattern is useful when exactly one object is needed to coordinate actions across the system, such as managing a configuration or a connection pool.

## Implementing Singleton Design Pattern in 5 ways

![](https://cdn-images-1.medium.com/max/3180/1*aKtgKaGyl4sDrzOosFGblQ.png)

### 1. Lazy Initialization — Basic Singleton

* The Singleton class implements lazy initialization. It creates an instance of the class only if the instance is not already created. This is done in the getInstance method.

* **Pros:** Simple implementation & lazy loading.

* **Cons:** Not thread-safe, not clone-safe and susceptible to reflection APIs..

### 2. Eager Initialization — Eager Singleton

* The EagerSingleton implementation creates an instance of the class when the class is loaded into the memory. It is straightforward to implement but has the drawback of being created even if the instance is not needed.

* **Pros:** Simple and straightforward, Thread-Safe.

* **Cons:** Not clone-safe, susceptible to reflection APIs, Resource Consumption
>  Instance is created during class loading phase which might be inefficient. This means that as soon as the class is loaded into the JVM, an instance of the EagerSingletonclass is created, regardless of whether it is immediately needed or not. The potential drawback of this approach is that it may lead to resource consumption, especially if the EagerSingletonobject is resource-intensive or if the application does not always require the singleton instance at the beginning. This can result in unnecessary resource utilization and may impact the performance of the application.

### 3. Thread-Safe Singleton

* The ThreadSafeSingleton class addresses the issue of the basic singleton when used in a multithreaded environment. The synchronized keyword is used to ensure that only one thread can execute this method at a time.

* Also using Double-Checked locking ensures thread safety while minimizing synchronization overhead.

* The threadEntryCount volatile variable is used to track how many times the singleton is accessed in a multithreaded environment (Note: This is done as a part of testing the model).

* **Pros:** Thread-safe & lazy initialization.

* **Cons:** Synchronization overhead, not clone-safe and susceptible to reflection APIs.

### 4. Serialization-Safe Singleton

* The SerializationSafeSingleton class ensures that the singleton contract is maintained during serialization and de-serialization. The readResolve method is used to return the existing instance during de-serialization.

* **Pros:** Thread-safe & handles Serialization.

* **Cons:** Complexity — Double-checked locking introduces complexity, not clone-safe and susceptible to reflection APIs.

### 5. Enum Singleton

* The EnumSingleton implementation leverages Java enums to create a singleton. Enums in Java are inherently serializable and thread-safe.

* Note: The purpose of default constructor here is to check for eager instantiation of the EnumSingleton class (done as a part of testing).

* **Pros:** Thread-safe, handles Serialization, clone-safe & immune to Reflection APIs.

* **Cons:** Not Lazy-Loaded.

## Testing and Demonstrations

The SingletonTest class serves as a detailed demonstration and validation suite for various implementations of the Singleton Pattern. Its primary purpose is to showcase the behavior of different singleton instances and to test the robustness of these implementations under various scenarios.

Here’s a brief overview of what SingletonTest is doing:

* lazySingletonTest(): Demonstrates lazy singleton behavior.

* eagerSingletonTest(): Demonstrates eager singleton behavior.

* serializationSafeSingletonTest(): Tests serialization mechanism and vulnerability of the serialization-safe singleton to reflection API attacks.

* enumSingletonTest(): Tests the Enum singleton instances, thread safety, serialization mechanism and vulnerability to reflection API attacks.

* threadSafeSingletonTest(): Tests thread safety.

### Multithreading Test:

The MyThread, ThreadA, ThreadB, and ThreadC classes simulate a multithreading scenario where multiple threads access the ThreadSafeSingleton class concurrently.

* MyThread class serves as the entry point for the multithreading test.

* Three threads (tA, tB, and tC) are created, each instantiated with different instances of classes implementing the Runnable interface (ThreadA, ThreadB, and ThreadC).

* Each thread is started (start() method is called), and join() is used to ensure that the main thread waits for each of the threads to finish before proceeding.

* Multiple threads concurrently access and create instances of the singleton, and the threadEntryCount variable (volatile) is used to track the number of times the singleton is accessed.

This type of test is essential to ensure that the singleton pattern is implemented correctly and safely in a multithreaded environment. It helps identify potential issues related to race conditions and thread safety.

## Conclusion

In conclusion, the Singleton Pattern offers a versatile and powerful solution for scenarios where a single, globally accessible instance of a class is essential. Throughout our exploration, we delved into different flavors of the Singleton Pattern, each addressing specific challenges and requirements in its unique way.

The Lazy Initialization (Basic Singleton) is simple and efficient, but its lack of thread safety may pose challenges in multithreaded environments. On the other hand, the Eager Initialization (Eager Singleton) ensures thread safety at the cost of immediate resource consumption. It’s a trade-off between simplicity and resource efficiency.

The Thread-Safe Singleton mitigates the multithreading issues of the basic singleton, introducing synchronization mechanisms. While effective, this solution comes with a performance cost due to the synchronized keyword.

The Serialization-Safe Singleton takes thread safety a step further, ensuring the singleton’s integrity during serialization and de-serialization. However, the implementation complexity increases with the introduction of double-checked locking.

The unique and concise Enum Singleton stands out for its elegance and inherent thread and reflection safety. However, its rigidity may limit extensibility in certain scenarios.

As we navigated through these implementations, we witnessed how each addresses specific concerns, offering a nuanced approach to the challenges of creating a single instance. From the simplicity of lazy loading to the robustness of enum-based singletons, the choice depends on the project’s requirements, balancing factors like thread safety, performance, and extensibility.

The Singleton Pattern, in its various forms, remains a cornerstone in the toolkit of software design patterns. Whether optimizing for resource efficiency, thread safety, or serialization integrity, understanding these variations empowers developers to make informed decisions and craft resilient, maintainable systems. Ultimately, the journey through the Singleton Pattern showcases the importance of adaptability and thoughtful consideration in the pursuit of designing effective and scalable software solutions.

## Resources

1. **GitHub** — [https://github.com/Neelesh-Janga/23-Java-Design-Patterns/tree/main/src/com/neelesh/design/patterns/creational/singleton](https://github.com/Neelesh-Janga/23-Java-Design-Patterns/tree/main/src/com/neelesh/design/patterns/creational/singleton)

2. **Refactoring Guru** — [https://refactoring.guru/design-patterns/singleton/java/example](https://refactoring.guru/design-patterns/singleton/java/example)

3. **Digital Ocean** — [https://www.digitalocean.com/community/tutorials/java-singleton-design-pattern-best-practices-examples](https://www.digitalocean.com/community/tutorials/java-singleton-design-pattern-best-practices-examples)
