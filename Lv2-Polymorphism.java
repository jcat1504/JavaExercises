// - Once again, polymorphism is the ability for an object to take on different forms during run time.

// We can achieve polymorphism by using interfaces

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