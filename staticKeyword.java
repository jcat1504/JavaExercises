public class Car {
	private String name;
	private String engine;

	public static int numberOfCars;

	public Car(String name, String engine) {
		this.name = name;
		this.engine = engine;
		numberOfCars++;
	}
	//getters and setters
}
@Test
public void testStaticCounterIncreases() {
	new Car("Jaguar", "v8");
	new Car("BMW", "W16");

assertEquals(2, Car.numberOfCars);
}

//example of static class
public class Singleton {
	private Singleton() {
		private static class SingletonHolder {
			public static final Singleton instance = new Singleton();
			}

		public static Singleton getInstance() {
			return SingletonHolder.instance;
			}
}

//In Java, **when we declare a field *static*, exactly a single copy of that field is created and shared among all instances of that class.**

//It doesn't matter how many times we instantiate a class. There will always be only one copy of *static* field belonging to it. The value of this *static* field is shared across all objects of either the same class.

//From the memory perspective, **static variables are stored in the heap memory.**