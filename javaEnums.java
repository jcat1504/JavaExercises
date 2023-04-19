//Enum is a special type of class that represents a fixed set of constants. These constants are typically used to represent a set of related values that have a well-defined range. 

//- An enum can have instance variables, constructors, and methods just like a regular class, but its instances are typically predefined and cannot be changed at runtime.
//- They can be useful for representing a fixed set of values in a type-safe way.

public enum PizzaStatus {
    ORDERED,
    READY, 
    DELIVERED; 
}

public class Pizza {
	private PizzaStatus status;
	public enum PizzaStatus {
		ORDERED,
		READY,
		DELIVERED;
		}

public boolean isDeliverable() {
	if (getStatus() == PizzaStatus.READY) {
		return true;
		}
			return false;
		}

//methods that set and get the status variable

}

//In the given code, private PizzaStatus statusis a private instance variable of the Pizzaclass, which has a type of the PizzaStatusenum that is defined inside the Pizzaclass. It means that any instance of the Pizzaclass has its own statusvariable that can only be accessed and modified by the methods defined in the Pizzaclass.

public int getDeliveryTimeInDays() {
	switch(status) {
		case ORDERED: return 5;
		case READY: return 2;
		case DELIVERED: return 0;
	}
	return 0;
}

//Fields, Methods and Constructors in Enums
public class Pizza {
	private PizzaStatus status;
	public enum PizzaStatus {
		ORDERED (5) {
			@Override
			public boolean isOrdered() {
				return true;
			}
		},
		READY (2) {
			@Override
			public boolean isReady() {
				return true;
				}
			},
		DELIVERED (0) {
			@Override
			public boolean isDelivered() {
				return true;
			}
		};

	private int timeToDelivery;
	public boolean isOrdered() {return false;}
	public boolean isReady() {return false;}
	public boolean isDelivered() {return false;}

	public int getTimeToDelivery() {
		return timeToDelivery
		}
	PizzaStatus (int timeToDelivery) {
		this.timeToDelivery = timeToDelivery;
	}
}

public boolean isDeliverable() {
	return this.status.isReady();
}

public void printTimeToDeliver() {
	System.out.println("Time to delivery is " + 
		this.getStatus().getTimeToDelivery());
	}

//methods that set and get the status variable
}

@Test
public void givenPizzaOrder_whenReady_thenDeliverable() {
	Pizza testPz = new Pizza();
	testPz.setStatus(Pizza,PizzaStatus.READY);
	assertTrue(testPz.isDeliverable());
}

//EnumSet
public class Pizza {
	private static EnumSet<PizzaStatus> undeliveredPizzaStatuses = 
		EnumSet.of(PizzaStatus.ORDERED, PizzaStatus.READY);

	private PizzaStatus status;
	public enum PizzaStatus {
		...
		}

	public boolean isDeliverable() {
		return this.status.isReady();
	}

	public void printTimeToDeliver() {
		System.out.println("Time to delivery is " + 
		this.getStatus().getTimeToDelivery() + " days");
		}

	public static List<Pizza> getAllUndeliveredPizzas(List<Pizza> input) {
		return input.stream().filter(
			(s) -> undeliveredPizzaStatuses.contain(s.getStatus()))
			.collect(Collectors.toList())l
			}
	
	public void deliver() {
		if (isDeliverable()) {
			PizzaDeliverySystemConfiguration.getInstance().getDeliveryStrategy()
			.deliver(this);
			this.setStatus(PizzaStatus.DELIVERED);
		}
}
//methods that set and get the status variable
}