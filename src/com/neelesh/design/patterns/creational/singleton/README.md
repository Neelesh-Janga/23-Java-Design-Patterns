**Link to Medium Post:** <a href = "https://medium.com/@Neelesh-Janga/f3d1abe6fe8d">Singleton Design Patterns in Java</a>
<hr>

## Singleton Design Patterns in Java: A Comprehensive Guide

![](https://cdn-images-1.medium.com/max/3840/1*AVa2JxCBjM_RuBCD0gZgwg.png)

## Overview of Singleton Design Pattern

The [Singleton Design Pattern](https://en.wikipedia.org/wiki/Singleton_pattern) is one of the creational design patterns, focusing on the instantiation of a class to ensure that only one instance of the class exists and provides a global point of access to that instance. This pattern is useful when exactly one object is needed to coordinate actions across the system, such as managing a configuration or a connection pool.

## Implementing Singleton Design Pattern in 5 ways

![](https://cdn-images-1.medium.com/max/3032/1*lyqBZZvpW0g_PeiQpac8pg.png)

### 1. Lazy Initialization — Basic Singleton
  * The Singleton class implements lazy initialization. It creates an instance of the class only if the instance is not already created. This is done in the getInstance method.
  * **Pro:** Simple implementation & lazy loading.
  * **Con:** Not Thread-Safe.

### 2. Eager Initialization — Eager Singleton

* The EagerSingleton implementation creates an instance of the class when the class is loaded into the memory. It is straightforward to implement but has the drawback of being created even if the instance is not needed.

* **Pro:** Simple and straightforward, Thread-Safe.

* **Con:** Resource Consumption — The instance is created even if it’s not used, which might be inefficient.

### 3. Thread-Safe Singleton

* The ThreadSafeSingleton class addresses the issue of the basic singleton when used in a multithreaded environment. The synchronized keyword is used to ensure that only one thread can execute this method at a time.

* Also using Double-Checked locking ensures thread safety while minimizing synchronization overhead.

* **Pro:** Thread-safe & lazy initialization.

* **Con:** Synchronization overhead.

### 4. Serialization-Safe Singleton

* The SerializationSafeSingleton class ensures that the singleton contract is maintained during serialization and de-serialization. The readResolve method is used to return the existing instance during de-serialization.
* **Pro:** Thread-safe & handles Serialization.
* **Con:** Complexity — Double-checked locking introduces complexity.

### 5. Enum Singleton
* The EnumSingleton implementation leverages Java enums to create a singleton. Enums in Java are inherently serializable and thread-safe.
* **Pro:** Thread-safe, handles Serialization & immune to Reflection APIs.
* **Con:** Limited extensibility — Enums cannot be subclassed or extended.

## Testing and Demonstrations
The SingletonTest class serves as a comprehensive demonstration and validation suite for various implementations of the Singleton Pattern. Its primary purpose is to showcase the behavior of different singleton instances and to test the robustness of these implementations under various scenarios.

Here’s a brief overview of what SingletonTest is doing:
1. Lazy Singleton Testing:
    * Creates instances of the lazy-initialized Singleton class.
    * Checks whether two instances are the same, demonstrating that only one instance is created.

2. Eager Singleton Testing:
   * Creates instances of the eagerly-initialized EagerSingleton class.
   * Verifies that the instances are identical, illustrating the singleton pattern’s guarantee of a single instance.

3. Thread-Safe Singleton Testing:
   * Utilizes the ThreadSafeSingleton class to create instances.
   * Ensures that thread safety is maintained by confirming that multiple threads can’t create separate instances simultaneously.

4. Serialization-Safe Singleton Testing:
   * Creates instances of SerializationSafeSingleton.
   * Validates that the singleton behavior persists during the process of serialization and de-serialization.

5. Serialization and De-serialization Testing:
   * Specifically focuses on the serialization and de-serialization of the ThreadSafeSingleton and SerializationSafeSingleton instances.
   * Demonstrates that the de-serialized objects are the same as the original ones, maintaining the singleton contract.

6. Reflection API Vulnerability Testing:
   * Explores potential vulnerabilities to reflection attacks on SerializationSafeSingleton.
   * Demonstrates how the readResolve method protects against the creation of additional instances during reflection-based instantiation.

7. Enum Singleton Testing:
   * Creates an instance of EnumSingleton.
   * Highlights the inherent thread safety, serialization safety, and reflection safety of enum-based singletons.

## Conclusion
In conclusion, the Singleton Pattern offers a versatile and powerful solution for scenarios where a single, globally accessible instance of a class is essential. Throughout our exploration, we delved into different flavors of the Singleton Pattern, each addressing specific challenges and requirements in its unique way.

The Lazy Initialization (Basic Singleton) is simple and efficient, but its lack of thread safety may pose challenges in multithreaded environments. On the other hand, the Eager Initialization (Eager Singleton) ensures thread safety at the cost of immediate resource consumption. It’s a trade-off between simplicity and resource efficiency.

The Thread-Safe Singleton mitigates the multithreading issues of the basic singleton, introducing synchronization mechanisms. While effective, this solution comes with a performance cost due to the synchronized keyword.

The Serialization-Safe Singleton takes thread safety a step further, ensuring the singleton’s integrity during serialization and de-serialization. However, the implementation complexity increases with the introduction of double-checked locking.

The unique and concise Enum Singleton stands out for its elegance and inherent thread and reflection safety. However, its rigidity may limit extensibility in certain scenarios.

As we navigated through these implementations, we witnessed how each addresses specific concerns, offering a nuanced approach to the challenges of creating a single instance. From the simplicity of lazy loading to the robustness of enum-based singletons, the choice depends on the project’s requirements, balancing factors like thread safety, performance, and extensibility.

The Singleton Pattern, in its various forms, remains a cornerstone in the toolkit of software design patterns. Whether optimizing for resource efficiency, thread safety, or serialization integrity, understanding these variations empowers developers to make informed decisions and craft resilient, maintainable systems. Ultimately, the journey through the Singleton Pattern showcases the importance of adaptability and thoughtful consideration in the pursuit of designing effective and scalable software solutions.

## Resources
* **Refactoring Guru** — [https://refactoring.guru/design-patterns/singleton/java/example](https://refactoring.guru/design-patterns/singleton/java/example)
* **Digital Ocean** — [https://www.digitalocean.com/community/tutorials/java-singleton-design-pattern-best-practices-examples](https://www.digitalocean.com/community/tutorials/java-singleton-design-pattern-best-practices-examples)
