// In OOP, classes are blueprints or templates for objects. We use them to describe types of entities

// On the other hand, objects are living entities, created from classes. They contain certain states within their fields and present certain behaviors with their methods 

class Car {
	//fields
	String type;
	String model;
	String color;
	int speed;

//constructor
Car(String type, String model, String color) {
	this.type = type;
	this.model = model;
	this.color = color;
}

//methods
	int increaseSpeed(int increment) {
		this.speed = this.speed + increment;
		return this.speed;
	}
// ...
}

// Fields hold state, constructor creates objects from this class.

// Every Java class has an empty constructor by default. We use it if we don’t provide specific implementation as we did above.

// ***this*** constructor simply initializes all fields of object with their default values. Strings are initialized to null, integers to 0.

// **Objects**

// While classes are translated during compile time, **objects are created from classes at run time.**

// Objects of a class are called ***instances*** and we create them with constructors:

Car focus = new Car("Ford", "Focus". "red");
Car auris = new Car("Toyota", "Auris", "blue");
Car golf = new Car("Volkswagen", "Golf", "blue");
// The point of it is that we define blueprint in one place and then reuse it as many times as we like - much like components
focus.increaseSpeed(10);
auris.increaseSpeed(20);
golf.increaseSpeed(30);

// **Access Modifiers**

// These modifiers determine the accessibility of classes, methods, and variables to other parts of the program. 

// **Classes usually have public modifiers but we tend to keep our fields private.**