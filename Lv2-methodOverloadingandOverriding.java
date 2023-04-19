//diff number of arguments
public class Multiplier {
	public int multiply(int a, int b) {
		return a * b;
}

	public int multiply(int a, int b, int c) {
		return a * b * c;
	}
}

//diff types
public class Multiplier {

	public int multiply(int a, int b) {
		return a * b; 
	}

	public int multiply(int a, int b, int c) {
		return a * b * c;
	}

	public int multiply(double a, double b) {
		return a * b;
	}
}

//method overriding
public class Vehicle {
	public String accelerate(long mph) {
		return "The vehicle accelerates at : " + mph + " MPH.";
		}
	public String stop() {
		return "Vehicle has stopped";
		}
	public String run() {
		return "The vehicle is running";
		}
}

//contrived subclass
public class Car extends Vehicle {
	@Override
	public String accelerate(long mph) {
		return "The car accelerates at : " + mph + " MPH!";
	}
}

//writing up a few unit tests to check Vehicle and Car classes
@Test
public void whenCalledAccelerate_thenOneAssertion() {
	assertThat(vehicle.accelerate(100))
		.isEqualTo("The vehicle accelerates at : 100 MPH.");
}

@Test
public void whenCalledRun_thenOneAssertion() {
	assertThat(vehicle.run())
		.isEqualTo("The vehicle is running");
}

@Test
public void whenCalledStop_thenOneAssertion() {
	assertThat(vehicle.stop())
		isEqualTo("Vehicle has stopped");
}

@Test
public void whenCalledAccelerate_thenOneAssertion() {
	assertThat(car.accelerates(80))
		isEqualTo("The car accelerates at : 80 MPH");
}

@Test
public void whenCalledRun_thenOneAssertion() {
	assertThat(car.run())
		isEqualTo("The vehicle is running");
}

@Test
public void whenCalledStop_thenOneAssertion() {
	assertThat(car.stop())
		isEqualTo("Vehicle has stopped");
}

@Test
public void testRunMethod() {
	assertThat(vehicle.run()).isEqualTo(car.run());
}

@Test
public void testStopMethod() {
	assertThat(vehicle.stop()).isEqualTo(car.stop());
}