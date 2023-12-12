# 23-Java-Design-Patterns

Design patterns are categorized into three main groups: creational, structural, and behavioral. Each pattern addresses specific design concerns and provides reusable solutions to common problems.

## Creational Design Patterns

### 1. [Singleton Pattern](https://medium.com/@Neelesh-Janga/singleton-design-patterns-in-java-a-comprehensive-guide-f3d1abe6fe8d)
Ensures that a class has only one instance and provides a global point of access to it.

### 2. [Factory Method Pattern](https://medium.com/@Neelesh-Janga/factory-pattern-in-java-a-creational-design-pattern-44bc1469d09e)
Defines an interface for creating an object but lets subclasses alter the type of objects that will be created.

### 3. [Abstract Factory Pattern](https://medium.com/@Neelesh-Janga/abstract-factory-pattern-in-java-a-comprehensive-guide-560d9016a92b)
Provides an interface for creating families of related or dependent objects without specifying their concrete classes.

**Example:** A GUI library might have abstract factories for creating buttons, windows, and other GUI elements for different operating systems.

### 4. [Builder Pattern](https://medium.com/@Neelesh-Janga/builder-pattern-in-java-a-comprehensive-guide-6e262064b5f2)
Separates the construction of a complex object from its representation, allowing the same construction process to create various representations.

### 5. [Prototype Pattern](https://medium.com/@Neelesh-Janga/prototype-design-pattern-in-java-a-comprehensive-guide-445fa197b984)
Creates new objects by copying an existing object, known as the prototype.

## Structural Design Patterns

### 6. [Adapter Pattern](https://medium.com/@Neelesh-Janga/adapter-pattern-in-java-a-structural-design-pattern-b3d227dcb6c9)
Allows incompatible interfaces to work together by providing a wrapper that converts one interface to another.

### 7. Bridge Pattern
Decouples an abstraction from its implementation so that the two can vary independently.

**Example:** The bridge pattern can be used in drawing applications where you have shape classes and drawing classes. The shape classes act as abstraction, and drawing classes act as an implementation.

### 8. Composite Pattern
Composes objects into tree structures to represent part-whole hierarchies. Clients can treat individual objects and compositions of objects uniformly.

**Example:** A graphic system where shapes (e.g., circles, squares) can be composed into larger structures.

### 9. Decorator Pattern
Attaches additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.

**Example:** Adding scroll bars or borders to a window dynamically.

### 10. Facade Pattern
Provides a unified interface to a set of interfaces in a subsystem. It simplifies a complex system by providing a high-level interface.

**Example:** A home theater system with a single remote control that provides simple commands to turn on the entire system.

### 11. Flyweight Pattern
Minimizes memory usage or computational expenses by sharing resources with related objects.

**Example:** Text editing software where a single character object is reused to represent each occurrence of that character in the document.

### 12. Proxy Pattern
Provides a surrogate or placeholder for another object to control access to it.

**Example:** Virtual proxy for lazy loading of large objects, where the real object is only loaded when required.

## Behavioral Design Patterns

### 13. Chain of Responsibility Pattern
Passes requests along a chain of handlers. Upon receiving a request, each handler decides either to process the request or to pass it to the next handler in the chain.

**Example:** Event handling in a graphical user interface.

### 14. Command Pattern
Encapsulates a request as an object, allowing for parameterization of clients with different requests, queuing of requests, and logging of the parameters.

**Example:** A menu system where each menu item is a command object that encapsulates a specific action.

### 15. Interpreter Pattern
Defines a grammar for interpreting the sentences in a language and provides an interpreter to interpret sentences of the language.

**Example:** Regular expression matching.

### 16. Iterator Pattern
Provides a way to access the elements of an aggregate object sequentially without exposing its underlying representation.

**Example:** Iterating over elements in a collection.

### 17. Mediator Pattern
Defines an object that encapsulates how a set of objects interact. It promotes loose coupling by keeping objects from referring to each other explicitly.

**Example:** Air traffic control system where planes communicate through the control tower, not directly with each other.

### 18. Memento Pattern
Captures and externalizes an object's internal state so that the object can be restored to this state later.

**Example:** Undo functionality in a text editor.

### 19. Observer Pattern
Defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.

**Example:** Implementing event handling systems.

### 20. State Pattern
Allows an object to alter its behavior when its internal state changes. The object will appear to change its class.

**Example:** A turnstile that changes its behavior based on its state (locked or unlocked).

### 21. Strategy Pattern
Defines a family of algorithms, encapsulates each algorithm, and makes them interchangeable. It lets the algorithm vary independently from clients that use it.

**Example:** Sorting algorithms in a sorting application can be encapsulated as strategies.

### 22. Template Method Pattern
Defines the skeleton of an algorithm in the superclass but lets subclasses override specific steps of the algorithm without changing its structure.

**Example:** A framework for building houses with steps that can be customized by subclasses.

### 23. Visitor Design Pattern
Allows you to define new operations without changing the classes of the elements on which the operation operates.

**Example:** FileVisitor interface in java.nio.file package is a representation of the Visitor pattern

## Conclusion

These design patterns provide general solutions for common design problems. When appropriately applied, they contribute to building scalable, flexible, and maintainable software systems.
