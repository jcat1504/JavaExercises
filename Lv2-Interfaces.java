// Interface is an abstract type that contains a collection of methods and constant variables. It is one of the core concepts in Java and used to achieve abstraction, polymorphism and multiple inheritances 

// - Polymorphism: The ability of an object to take on different forms or behaviors depending on the context which it is used. In OOP, it allows objects of different classes to be treated as if they are the same class. This is achieved through inheritance and method overriding
//     - It enables us to write more flexible and reusable code.

public interface Electronic {
	String LED = "LED";
	//abstract method
	int getElectricityUse();
	//static method
	static boolean isEnergyEfficient(String electronicType) {
		if (electronicType.equals(LED)) {
			return true;
			}
			return false;
		}

//default method 
		default void printDescription() {
			System.out.println("Electrionic Description");
		}
}

//We can implement an interface in a Java class by using the implements keyword:
public class Computer implements Electronic {
	@Override
	public int getElectricityUse() {
		return 1000;
	}