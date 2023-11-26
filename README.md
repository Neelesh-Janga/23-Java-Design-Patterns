# 23-Java-Design-Patterns

Design patterns are categorized into three main groups: creational, structural, and behavioral. Each pattern addresses specific design concerns and provides reusable solutions to common problems.

## Creational Design Patterns

### 1. Singleton Pattern
Ensures that a class has only one instance and provides a global point of access to it.

### 2. Factory Method Pattern
Defines an interface for creating an object but lets subclasses alter the type of objects that will be created.

### 3. Abstract Factory Pattern
Provides an interface for creating families of related or dependent objects without specifying their concrete classes.

**Example:** A GUI library might have abstract factories for creating buttons, windows, and other GUI elements for different operating systems.

### 4. Builder Pattern
Separates the construction of a complex object from its representation, allowing the same construction process to create various representations.

### 5. Prototype Pattern
Creates new objects by copying an existing object, known as the prototype.

### 6. Object Pool Pattern
Manages a pool of reusable objects, reducing the overhead of creating and destroying objects.

## Structural Design Patterns

### 7. Adapter Pattern
Allows incompatible interfaces to work together by providing a wrapper that converts one interface to another.

### 8. Bridge Pattern
Decouples an abstraction from its implementation so that the two can vary independently.

**Example:** The bridge pattern can be used in drawing applications where you have shape classes and drawing classes. The shape classes act as abstraction, and drawing classes act as an implementation.

### 9. Composite Pattern
Composes objects into tree structures to represent part-whole hierarchies. Clients can treat individual objects and compositions of objects uniformly.

**Example:** A graphic system where shapes (e.g., circles, squares) can be composed into larger structures.

### 10. Decorator Pattern
Attaches additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.

**Example:** Adding scroll bars or borders to a window dynamically.

### 11. Facade Pattern
Provides a unified interface to a set of interfaces in a subsystem. It simplifies a complex system by providing a high-level interface.

**Example:** A home theater system with a single remote control that provides simple commands to turn on the entire system.

### 12. Flyweight Pattern
Minimizes memory usage or computational expenses by sharing resources with related objects.

**Example:** Text editing software where a single character object is reused to represent each occurrence of that character in the document.

### 13. Proxy Pattern
Provides a surrogate or placeholder for another object to control access to it.

**Example:** Virtual proxy for lazy loading of large objects, where the real object is only loaded when required.

## Behavioral Design Patterns

### 14. Chain of Responsibility Pattern
Passes requests along a chain of handlers. Upon receiving a request, each handler decides either to process the request or to pass it to the next handler in the chain.

**Example:** Event handling in a graphical user interface.

### 15. Command Pattern
Encapsulates a request as an object, allowing for parameterization of clients with different requests, queuing of requests, and logging of the parameters.

**Example:** A menu system where each menu item is a command object that encapsulates a specific action.

### 16. Interpreter Pattern
Defines a grammar for interpreting the sentences in a language and provides an interpreter to interpret sentences of the language.

**Example:** Regular expression matching.

### 17. Iterator Pattern
Provides a way to access the elements of an aggregate object sequentially without exposing its underlying representation.

**Example:** Iterating over elements in a collection.

### 18. Mediator Pattern
Defines an object that encapsulates how a set of objects interact. It promotes loose coupling by keeping objects from referring to each other explicitly.

**Example:** Air traffic control system where planes communicate through the control tower, not directly with each other.

### 19. Memento Pattern
Captures and externalizes an object's internal state so that the object can be restored to this state later.

**Example:** Undo functionality in a text editor.

### 20. Observer Pattern
Defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.

**Example:** Implementing event handling systems.

### 21. State Pattern
Allows an object to alter its behavior when its internal state changes. The object will appear to change its class.

**Example:** A turnstile that changes its behavior based on its state (locked or unlocked).

### 22. Strategy Pattern
Defines a family of algorithms, encapsulates each algorithm, and makes them interchangeable. It lets the algorithm vary independently from clients that use it.

**Example:** Sorting algorithms in a sorting application can be encapsulated as strategies.

### 23. Template Method Pattern
Defines the skeleton of an algorithm in the superclass but lets subclasses override specific steps of the algorithm without changing its structure.

**Example:** A framework for building houses with steps that can be customized by subclasses.

## Conclusion

These design patterns provide general solutions for common design problems. When appropriately applied, they contribute to building scalable, flexible, and maintainable software systems.
