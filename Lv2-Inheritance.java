//Interface is an abstract type that contains a collection of methods and constant variables. It is one of the core concepts in Java and used to achieve abstraction, polymorphism and multiple inheritances 
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

    //Behavioral Functionality
    public class Employee {
        private double salary;
        public double getSalary()
            return salary;
        }
    
        public void setSalary(double salary) {
            this.salary = salary;
        }
    
    public class EmployeeSalaryComparator implements Comparator<Employee> {
        @Override
        public int compare(Employee employeeA, Employee employeeB) {
            if (employeeA.getSalary() < employeeB.getSalary()) {
                return -1;
            } else if (employeeA.getSalary() > employeeB.getSalary()) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    //Multiple Inheritances
    public interface Transform() {
        void transform();
    }
    public interface Fly {
        @Override 
        void fly();
    }
    
    public class Car implements Fly, Transform {
        @Override
        public void fly() {
            System.out.println("I can fly!");
            }
    
        @Override 
        public void transform() {
            System.out.println("I can Transform!");
        }
    }

    //Polymorphism
    public interface Shape {
        String name();
    }
    
        public class Circle implements Shape {
            @Override
            public String name() {
                return "Circle";
        }
    }
        public class Square implements Shape {
            @Override
            public String name() {
                return "Square";
        }
    }
    List<Shape> shapes = new ArrayList<>();
    Shape circleShape = new Circle();
    Shape squareShape = new Square();
    
    shapes.add(circleShape);
    shapes.add(squareShape);
    
    for (Shape shape : shapes) {
            System.out.println(shape.name());
    }

    //Interface Inheritance
    public interface Floatable {
        void floatOnWater();
    }
    
    public interface Flyable {
        void fly();
    }
    
    public class ArmoredCar extends Car implements Floatable, Flyable {
        public void floatOnWater() {
            System.out.println("I can float!");
        }
        public void fly() {
            System.out.println("I can fly!");
        }
    }

    //Inheriting Type
    public class Employee {
        private String name;
        private Car car;
    
    //standard constructor
    }
    
    Employee e1 = new Employee("Jess", new ArmoredCar());
    Employee e2 = new Employee("Vincent", new SpaceCar());
    