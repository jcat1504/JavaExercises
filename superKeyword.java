//We use super() to call the parent default constructor. It should be the first statement in a constructor. It should always be the first statement in a constructor
public class SuperSub extends SuperBase {
	public SuperSub(String message) {
		super(message);
	}
}

Supersub child = new SuperSub("message from the child class!");