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
public class Car {
    private String type;
    // ...

    public Car(String type, String model, String color) {
       // ...
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    // ...
}

// **Our class is marked *public*, which means we can use it in any package.** Also, the constructor is *public*, which means we can create an object from this class inside any other object.

// **Our fields are marked *private*, which means they're not accessible from our object directly**, but we provide access to them through getters and setters.

// Setters: updates value of variable

// Getters: reads value of variable

// The *type* and *model* fields do not have getters and setters, because they hold internal data of our objects. We can define them only through the constructor during initialization.

// Furthermore, the *color* can be accessed and changed, whereas *speed* can only be accessed, but not changed. We enforced speed adjustments through specialized *public* methods *increaseSpeed()* and *decreaseSpeed()*.

// In other words, **we use access control to encapsulate the state of the object.**

// ## **Getters and Setters**

// - Getter: (accessor method) is used to retrieve the value of a private variable in a class. It is a public method that returns the value of the private variable it is associated with.
//     - By convention, the name of getter method should start with “get” followed by name of private variable

public class Person {
	private String name;
 
	public String getName() {
	   return name;
	}
 }