✅ What is Method Overriding?
Method Overriding in Java is when a subclass provides a specific implementation of a method that is already defined in its superclass.

The overriding method:

Must have the same name,

Same return type (or a subtype),

Same parameters as the method in the parent class.

🔑 Key Points:
Feature	Overriding
Scope	Happens in inheritance (subclass extends superclass)
Signature	Method name and parameters must be the same
Return type	Must be the same or covariant (subclass of return type)
Access modifier	Cannot be more restrictive than the superclass method
Static methods	Cannot be overridden (they are hidden instead)
Constructors	Cannot be overridden
Final methods	Cannot be overridden
Private methods	Not inherited, so cannot be overridden

🧪 Example
java
Copy
Edit
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

public class Test {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.makeSound();  // Output: Dog barks
    }
}
📌 Explanation:
Dog overrides the makeSound() method of Animal.

At runtime, Java calls the overridden method of the actual object type (Dog), not the reference type (Animal).

This is known as runtime polymorphism or dynamic method dispatch.

🛑 What You Cannot Override
Modifier	Can Override?	Reason
final	❌ No	Prevents modification
static	❌ No (hidden)	Method belongs to class, not instance
private	❌ No	Not inherited
constructor	❌ No	Not inherited

⚠️ Access Modifiers Rule
Superclass Modifier	Subclass can use
public	public only
protected	protected or public
default (package)	default, protected, or public (in same package)
private	N/A (cannot override)

✅ Use of @Override Annotation
java
Copy
Edit
@Override
void makeSound() {
    // custom implementation
}
Helps to catch errors at compile time if method signature doesn't match.

Recommended for clarity and safety.

🧠 Real-life Analogy
Think of a general template (superclass) like a "Vehicle" having a method startEngine(). A Car subclass can override that method to provide specific logic, e.g., using a key or push-button.

