

🔷 What is an Interface?
An interface in Java is a blueprint of a class. It defines a contract that implementing classes must follow.

It contains abstract methods (by default).

It cannot have method implementations (until Java 8+).

A class implements an interface using the implements keyword.

🧱 Syntax
java
Copy
Edit
public interface Animal {
    void makeSound(); // abstract method
}
java
Copy
Edit
public class Dog implements Animal {
    public void makeSound() {
        System.out.println("Bark");
    }
}
🔑 Key Features
Feature	Description
Methods	Abstract by default (no body)
Variables	public static final by default
Multiple Inheritance	A class can implement multiple interfaces
No Constructors	Cannot create instances directly
Java 8+	Can include default and static methods
Java 9+	Can include private methods

🆚 Interface vs Abstract Class
Feature	Interface	Abstract Class
Multiple Inheritance	Yes	No
Method Types	Only abstract, default, static	Abstract + Concrete
Fields	public static final only	Any type
Constructor	No	Yes
Usage	Behavior contract	Base class for subclasses

🔄 Java 8 Enhancements
java
Copy
Edit
interface Vehicle {
    void start();

    // Default method
    default void honk() {
        System.out.println("Beep!");
    }

    // Static method
    static void showType() {
        System.out.println("This is a vehicle");
    }
}
✅ When to Use Interfaces?
When you want to define behavior without implementation

When multiple unrelated classes should share the same method signature

When you need multiple inheritance of type

🎯 Real-Life Example
java
Copy
Edit
interface Payment {
    void processPayment(double amount);
}

class CreditCard implements Payment {
    public void processPayment(double amount) {
        System.out.println("Paid ₹" + amount + " via Credit Card");
    }
}

class UPI implements Payment {
    public void processPayment(double amount) {
        System.out.println("Paid ₹" + amount + " via UPI");
    }
}