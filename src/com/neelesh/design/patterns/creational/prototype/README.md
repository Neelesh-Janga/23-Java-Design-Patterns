**Link to Medium Post:** <a href = "https://medium.com/@Neelesh-Janga/prototype-design-pattern-in-java-a-comprehensive-guide-445fa197b984">Prototype Design Pattern in Java</a>
<hr>

# Prototype Design Pattern Overview
<img alt="" class="bg kr md c" loading="eager" role="presentation" src="https://miro.medium.com/v2/resize:fit:1000/1*ybZjxu8bvjB1kl74F9kIiA.png">

## Intent

The Prototype pattern aims to create new objects by copying an existing object, known as the prototype. This allows you to create new instances without the need to instantiate a class from scratch, which can be beneficial when the cost of object creation is high or complex.

## Components
<img alt="Prototype Design Pattern UML Model" class="bg kr md c" loading="eager" src="https://miro.medium.com/v2/resize:fit:700/1*IBEcGMu5mYiwNNdiNjc3aQ.png">

### Prototype (Mobile)

- This is an abstract class or interface that declares the interface for cloning itself.
- In the code, `Mobile` serves as the prototype with common properties such as `touchScreen`, `waterResistance`, `color`, etc.
- It declares the `clone` method, which concrete classes will implement to create a copy of themselves.

### Concrete Prototypes (Android, IOS)

- These are concrete classes that implement the `clone` method from the prototype.
- In the code, `Android` and `IOS` extend the `Mobile` class, providing specific implementations for cloning.
- Each concrete prototype contains additional properties (`androidVersion`, `androidCodeName`, `iOSVersion`, `iOSCodeName`) specific to Android or iOS devices.

### Client (PrototypeTest)

- The client class is responsible for utilizing the prototypes to create new objects.
- In the code, `PrototypeTest` contains the `generateData` method that initializes instances of `Android` and `IOS` and demonstrates the cloning process.
- It prints information about the original and cloned objects, illustrating that they share the same data but are distinct instances.

## Walkthrough of the Code

1. **Initialization:**
    - Instances of Android (e.g., `oneplus`) and IOS (e.g., `iphone`) are created and initialized with specific properties.

2. **Cloning:**
    - The `clone` method in Android and IOS is invoked to create new instances (`newOneplus`, `sameOneplus`) by copying the properties from the original instances.

3. **Comparison:**
    - The code checks whether the original instance (`oneplus`) is the same as another instance referencing the same object (`sameOneplus`). It also checks whether the original instance is different from the cloned instance (`newOneplus`).

4. **Equality Check:**
    - The `equals` method in the Mobile class is used to compare the data equality of two instances.

5. **Modification:**
    - A property (`androidVersion`) is modified in the cloned instance (`newOneplus`).

6. **Print Information:**
    - The code prints information about the original and cloned instances, showcasing their properties.

## Conclusion

The Prototype pattern, as demonstrated in this code, provides a mechanism for creating new objects through cloning existing instances. It promotes flexibility, reduces the cost of object creation, and allows for efficient management of object variations. The code showcases the key elements of the Prototype pattern and how they interact to achieve these objectives.
