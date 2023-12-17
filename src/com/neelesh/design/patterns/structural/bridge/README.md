Published articles on <a href = "https://medium.com/@Neelesh-Janga/bridge-pattern-in-java-a-structural-design-pattern-07dab3fb0ead">Medium</a> and <a href = "https://www.linkedin.com/pulse/bridge-pattern-java-structural-design-neelesh-janga-60qqc%3FtrackingId=Vrrv9VfwRLeMf7qM5h5bww%253D%253D/?trackingId=Vrrv9VfwRLeMf7qM5h5bww%3D%3D">LinkedIn</a><hr>

## Bridge Pattern in Java: A Structural Design Pattern

![](https://cdn-images-1.medium.com/max/3840/1*PEmssIwuKdGjEqVYrQ4Vcw.png)

The Bridge Pattern is a structural design pattern that separates abstraction from its implementation so that the two can vary independently. This pattern involves creating a bridge interface, which is an interface that acts as a bridge between abstraction and implementation. The abstraction is an abstract class or interface, and the implementation is a set of concrete classes that implement the interface defined by the bridge.

### Key Components:

1. **Abstraction**: This is the high-level interface that clients interact with. It defines the abstract operations and maintains a reference to an object of type Implementor.

2. **Refined Abstraction**: This is an extension of the abstraction that can offer additional functionality. It is not required for the Bridge Pattern but can be useful in some cases.

3. **Implementor** (Bridge): This is the interface that defines the implementation methods. The concrete implementation classes implement this interface.

4. **Concrete Implementor**: These are the concrete classes that implement the Implementor interface. They define the specific implementation details.

### Abstraction and Implementation Separation:

The primary goal of the Bridge Pattern is to allow the abstraction and implementation to evolve independently. Changes in one do not affect the other. This separation enables you to modify the abstraction without changing the client code.

In my code:

* Remote and AdvanceRemote interfaces act as the Abstraction & Refined Abstraction.

* TV and AdvanceTV interfaces act as the Implementors.

* The concrete classes SamsungRemote and SonyRemoteare the implementations of the Abstraction Interfaces.

* The concrete classes SamsungTV and SonyTV are the implementations of the Implementor interfaces.

![UML Model of Bridge Pattern](https://cdn-images-1.medium.com/max/3788/1*VB2GHw1cIGoqly1YE4HJRA.png)

## Implementation Steps:

1. Identify the abstraction and its methods.

2. Create an interface (Implementor) for the implementation classes.

3. Implement concrete classes for the abstraction and the implementation.

4. Include a reference to the Implementor interface within the abstraction.

5. Use the abstraction and implementation interfaces in client code.

## Program Explanation

### 1. Interfaces: Remote and AdvanceRemote

* Remote: This interface declares basic operations for a remote control, such as turning the device on/off and setting the channel.

* AdvanceRemote: Extends Remote and introduces advanced operations like accessing streaming services (Netflix, Amazon Prime).

### 2. Classes: SamsungRemote and SonyRemote

* SamsungRemote and SonyRemote are implementations of the Remote and AdvanceRemote interfaces.

* They are designed to interact with a specific brand of TV (SamsungTV and SonyTV) to perform basic and advanced operations.

### 3. Interfaces: TV and AdvanceTV

* TV: Declares basic TV operations like turning the TV on/off and setting the channel.

* AdvanceTV: Extends TV and introduces advanced operations like playing Netflix and Amazon Prime Video.

### 4. Classes: SonyTV and SamsungTV

* SonyTV and SamsungTV are implementations of the TV and AdvanceTV interfaces.

* They provide concrete implementations for basic and advanced TV operations, specific to their brands.

### 5. Bridge Pattern Implementation: BridgeTest

* The BridgeTest class demonstrates the Bridge Pattern in action.

* It creates instances of SonyRemote and SamsungRemote, connecting them with SonyTV and SamsungTV, respectively.

* This demonstrates the flexibility of the Bridge Pattern, allowing the abstraction (Remote) and implementation (SonyRemote, SamsungRemote) to vary independently.

## Benefits of Bridge Pattern

1. Decoupling: The pattern decouples abstraction and implementation, allowing them to vary independently.

2. Extensibility: It enables the addition of new abstractions and implementations without modifying existing code.

3. Cleaner Code: The separation of concerns leads to cleaner, more maintainable code.

## Conclusion

The Bridge Pattern, as showcased in this code, is a structural design pattern that promotes loose coupling between abstraction and implementation. By separating the concerns of remote control functionality and TV operations, it allows for independent evolution and extensibility. This pattern proves particularly useful when you have multiple dimensions of variations in your system.

Utilizing the Bridge Pattern encourages a modular and flexible design, making it easier to introduce new TV brands, remote features, or streaming services without modifying existing code. It’s a powerful tool for crafting maintainable and extensible systems.

## Resources

1. **GitHub** — [https://github.com/Neelesh-Janga/23-Java-Design-Patterns/tree/main/src/com/neelesh/design/patterns/structural/bridge](https://github.com/Neelesh-Janga/23-Java-Design-Patterns/tree/main/src/com/neelesh/design/patterns/structural/bridge)

2. Freeman, E.; Freeman, E.; Bates, B. & Sierra, K. Loukides, M., ed. (2004), *Head First Design Patterns* , O’Reilly Media .

## Social Accounts

1. **LinkedIn** — [https://www.linkedin.com/in/neelesh-janga/](https://www.linkedin.com/in/neelesh-janga/)

2. **GitHub** — [https://github.com/Neelesh-Janga](https://github.com/Neelesh-Janga)
