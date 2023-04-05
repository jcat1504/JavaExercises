
// **Java Abstraction vs. Concrete Classes**

// - Not all Java types implement all their methods
// - **Abstraction**: Allows us to think in more general terms about the domain we’re trying to model. It refers to the **concept of hiding the implementation details of an object and exposing only the necessary information or functionality to the outside world**
//     - it is key principle of OOP and implemented through various mechanisms such as: *abstract classes, interfaces and encapsulation*
//     - It allows developers to focus on essential features of an object and ignore the details that are not relevant for its use, *leading to simpler and more maintainable code*
// - In Java, we can achieve abstraction through using interfaces and abstract classes
// - **Interface**: Blueprint for a class — or other words, collection of unimplemented method signatures

interface Drivable {
	void honk();
	void drive();
}

// - Because Drivable has unimplemented methods, we can’t instantiate it with *new* keyword
//     - But! Concreate classes like Car can implement these methods

// **Abstract Classes**

// - **It is a class that has unimplemented classes**, though can actually have both

public abstract class Vehicle {
	public abstract String honk();
	public String drive() {
		return "zooom!";
	}
}

