**Link to Medium Post:** <a href = "https://medium.com/@Neelesh-Janga/adapter-pattern-in-java-a-structural-design-pattern-b3d227dcb6c9">Adapter Pattern in Java</a>
<hr>



## Adapter Pattern in Java: A Structural Design Pattern

![](https://cdn-images-1.medium.com/max/3840/1*JL4wVunsWkJaP1-fMvF_sg.png)

The Adapter Design Pattern is a structural pattern that allows incompatible interfaces to work together. It acts as a bridge, allowing the integration of existing classes or systems with different interfaces without modifying their code. The pattern involves three key components:

1. Target Interface: This is the interface that the client code expects or relies on. It defines the operations that the client code will use.

2. Adapter: The adapter is responsible for making the existing class (Adaptee) compatible with the target interface. It wraps the Adaptee and provides the necessary translations or transformations.

3. Adaptee: The existing class or system that has an incompatible interface with the target interface. The Adaptee’s functionality needs to be made accessible through the target interface.

In this medium post, we will explore the Adapter Pattern by implementing a real-world scenario involving keypad and touch phones. The goal is to seamlessly integrate a Touch Phone interface into a system expecting a Keypad Phone. We’ll go step by step through the code, explaining the design decisions and demonstrating how the Adapter Pattern can be a powerful tool for making disparate systems work together.
>  Note:
The example demonstrated below works only for lowercase alphabets and spaces. No other characters are considered valid. If you are interested in making it more dynamic, consider adding uppercase letters and symbols as well — a challenge for yourself *🫡*.

## Code Breakdown

![UML Model of the Adapter Design Pattern](https://cdn-images-1.medium.com/max/3208/1*FVKA20aYzbYaT5Z9XduIWg.png)

### 1. Interfaces: KeypadPhone and TouchPhone

* These interfaces define the expected behaviors for keypad and touch phones, respectively.

### 2. Concrete Classes: Nokia and Samsung

* Nokia implements the KeypadPhone interface, representing a keypad phone that interprets keystrokes.

* Samsung implements the TouchPhone interface, representing a touch phone that interprets text.


### 3. Adapter Class: TouchPadAdapter

* This class adapts a Samsung touch phone to behave like a Nokia keypad phone.

* It uses a translation mechanism to convert text into keystrokes.
>  Note:
We know that in order to type ‘a,’ we should press ‘2.’ For ‘b,’ we should press ‘2’ two times quickly and consecutively, and for ‘c,’ we should repeat clicking ‘2’ three times consecutively, and so on. This is how translation mechanism happens in general. The number strings here indicate that the particular number should be clicked as many times as it appeared to get the given character in the switch statement.

### 4. Exception Class: TranslationException

* A custom exception class to handle translation errors during the adaptation process.

### 5. Testing: AdapterTest

* The main class demonstrates the usage of the Adapter Pattern.

* A Samsung touch phone is instantiated, and its text interpretation is showcased.

* The TouchPadAdapter is employed to adapt the touch phone to a keypad phone, and the adapted phone's interpretation is displayed.


## Step-by-Step Explanation

### — Interface Definition: KeypadPhone and TouchPhone

* We start by defining two interfaces, KeypadPhone and TouchPhone, representing different phone types.

### — Concrete Classes: Nokia and Samsung

* Nokia implements the KeypadPhone interface, providing functionality to interpret keystrokes.

* Samsung implements the TouchPhone interface, providing functionality to interpret text.

### — Exception Handling: TranslationException

* The custom exception class TranslationException is created to handle errors during the translation process.

### — Adapter Class: TouchPadAdapter

* The TouchPadAdapter class adapts a Samsung touch phone to behave like a Nokia keypad phone.

* It uses a translation mechanism (computeKeystroke) to convert each letter into its corresponding keystrokes.

### — Testing: AdapterTest

* The AdapterTest class demonstrates the Adapter Pattern in action.

* A Samsung touch phone is instantiated and its text interpretation is displayed.

* The TouchPadAdapter is used to adapt the touch phone to a keypad phone, and the adapted phone's interpretation is showcased.

The TouchPadAdapter class's interpretKeystrokes method uses a translation mechanism to convert text from the Samsung phone into the corresponding keystrokes expected by a Nokia keypad phone. If a letter is not found in the translation map, a TranslationException is thrown.

In summary, the Adapter Pattern is useful when you need to make existing classes work with others without modifying their source code. In this case, it allows a touch phone (Samsung) to be used in a context where a keypad phone (Nokia) is expected, thanks to the TouchPadAdapter.

### Pros of the Adapter Pattern:

1. Compatibility: The Adapter Pattern enables the integration of incompatible interfaces, fostering collaboration between different parts of a system.

2. Reusability: Adapters can be reused in various contexts, promoting code reuse and reducing redundancy in system design.

3. Flexibility: The pattern allows for the introduction of new functionalities without modifying existing code, ensuring flexibility and adaptability to changing requirements.

4. Maintenance: It simplifies system maintenance by encapsulating the complexities of interface conversions within the adapter, making updates and modifications more manageable.

### Cons of the Adapter Pattern:

1. Complexity: In some cases, introducing adapters may lead to an increase in the overall complexity of the system, especially when dealing with a large number of adapters.

2. Performance Overhead: Adapters may introduce a slight performance overhead due to the additional layer of abstraction and redirection of calls.

3. Design Overhead: When not used judiciously, the Adapter Pattern can result in unnecessary class proliferation, making the codebase harder to understand and maintain.

## Conclusion

In summary, the adapter pattern elegantly resolves interface mismatches between a Samsung touchpad and a Nokia keypad. The TouchPadAdapter class seamlessly translates keystrokes, enabling communication between incompatible interfaces. While the current implementation focuses on lowercase letters and spaces, its adaptability allows for easy extension to accommodate uppercase letters and symbols. This pattern proves its value in achieving system interoperability and maintaining code modularity.

In conclusion, the Adapter Pattern stands as a testament to the effectiveness of design patterns in addressing software development challenges. Its judicious application empowers developers to strike a balance between innovation and integration, laying the groundwork for resilient and future-ready software systems. Understanding its nuances allows for informed decision-making, ensuring that the Adapter Pattern remains a valuable asset in the software designer’s toolkit.

## Resources

1. **GitHub** — [https://github.com/Neelesh-Janga/23-Java-Design-Patterns/tree/main/src/com/neelesh/design/patterns/structural/adapter](https://github.com/Neelesh-Janga/23-Java-Design-Patterns/tree/main/src/com/neelesh/design/patterns/structural/adapter)

## Social Accounts

1. **LinkedIn** — [https://www.linkedin.com/in/neelesh-janga/](https://www.linkedin.com/in/neelesh-janga/)

2. **GitHub** — [https://github.com/Neelesh-Janga](https://github.com/Neelesh-Janga)
