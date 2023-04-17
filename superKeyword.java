//We use super() to call the parent default constructor. It should be the first statement in a constructor. It should always be the first statement in a constructor
public class SuperSub extends SuperBase {
	public SuperSub(String message) {
		super(message);
	}
}

Supersub child = new SuperSub("message from the child class!");

//accessing parent class variables
public class SuperBase {
	String message = "super class";

//default constructor

	public SuperBase(String message) {
		this.message = message;
	}
}
//now we create child class with var of same name
public class SuperSub extends SuperBase {
	String message = "Child class";
	public void getParentMessage() {
		System.out.println(super.message);
	}
}

public class SuperBase {
	String message = "super class";

	public void printMessage() {
		System.out.println(message);
	}
}
public class SuperSub extends SuperBase {
	String message = "child class";

	public SuperSub() {
		super.printMessage();//super class
		printMessage();//child class
		}

public void printMessage() {
	System.out.println(message);
	}
}
//super keyword with method overriding