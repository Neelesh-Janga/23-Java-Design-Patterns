
## Factory Pattern in Java: A Creational Design Pattern

![](https://cdn-images-1.medium.com/max/3840/1*gZ5esMeC6tlvGibcJbMOWg.png)

## Introduction:

In the realm of design patterns, the Factory Pattern stands out as a versatile and descent way to create objects. In this post, we’ll delve into the core concepts of the Factory Pattern and explore a practical implementation in Java. To illustrate its application, we’ll use a simple example involving vehicles — cars, bikes, and cycles.

## Understanding the Factory Pattern:

The Factory Pattern falls under the creational design patterns category. Its primary goal is to provide an interface for creating instances of a class. This promotes loose coupling, enhances flexibility, and simplifies code maintenance.

![](https://cdn-images-1.medium.com/max/2900/1*6WwAjo4IUXQ4PqNXBLx_3Q.png)

### The Vehicle Hierarchy:

To showcase the Factory Pattern, we’ll define a hierarchy of vehicle classes — Vehicle, Car, Bike, and Cycle. Each vehicle extends the base Vehicle class, creating a simple class hierarchy. This abstract class defines a default constructor and declares an abstract method, drive(), leaving the implementation details to its subclasses.

### Concrete Vehicle Classes

Concrete vehicle classes such as Bike, Car, and Cycle extend the Vehicle class. Each of these classes provides its own implementation of the drive method, capturing the unique driving behavior of the respective vehicle.

### The Factory Class:

The heart of the Factory Pattern lies in the Factory class. This class is responsible for creating instances of different vehicles based on a provided string identifier. The getInstance method uses a switch statement to determine the type of vehicle requested and returns an instance of the corresponding class.


### Handling Invalid Inputs with a Custom Exception

To fortify our Factory Pattern implementation, I’ve introduced a custom exception, InvalidVehicleException. This exception extends RuntimeException and is thrown when the factory receives an unrecognized vehicle type.


### Creating Vehicles with the Factory:

In the FactoryTest class, we demonstrate how to use the Factory to create instances of vehicles. By calling getInstance with different vehicle types passed as the parameter, we obtain corresponding objects. Additionally, the factory method includes a default case for handling unknown vehicle types.


### Console Output:

To emphasize the object creation process, each factory method prints a message indicating the type of object that has been created. This provides insights into the internal workings of the Factory Pattern.

    Car Object Created!!
    Driving a Car
    Bike Object Created!!
    Riding a Bike
    Cycle Object Created!!
    Riding a Cycle
    Unable to create object for an invalid vehicle

## Conclusion:

In the realm of Java design patterns, the Factory Pattern emerges as a concise yet powerful tool. By centralizing object creation in the Factory class, we foster a modular, easily extensible codebase. The custom exception safeguards against unforeseen errors, enhancing code robustness.

This design philosophy paves the way for seamless code evolution, allowing developers to effortlessly integrate new features without disrupting existing functionality.

Incorporate the Factory Pattern into your coding arsenal, not just as a method but as a mindset — streamlining your code’s evolution for the challenges of tomorrow.

## Resources

1. **GitHub** — [https://github.com/Neelesh-Janga/23-Java-Design-Patterns/tree/main/src/com/neelesh/design/patterns/creational/factory](https://github.com/Neelesh-Janga/23-Java-Design-Patterns/tree/main/src/com/neelesh/design/patterns/creational/factory)

## Social Accounts

1. **LinkedIn** — [https://www.linkedin.com/in/neelesh-janga/](https://www.linkedin.com/in/neelesh-janga/)

2. **GitHub** — [https://github.com/Neelesh-Janga](https://github.com/Neelesh-Janga)
