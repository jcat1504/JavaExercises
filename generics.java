public class Container<T extends Number> {
    private T[] elements;
    private int size;

    public Container(int capacity) {
        elements = (T[]) new Number[capacity];
        size = 0;
    }

    public void add(T element) {
        elements[size++] = element;
    }

    public T get(int index) {
        return elements[index];
    }

    public double sum() {
        double sum = 0.0;
        for (int i = 0; i < size; i++) {
            sum += elements[i].doubleValue();
        }
        return sum;
    }
}

public class Main {
    public static void main(String[] args) {
      String test1 = "Double";
      double test2 = 5.8;
  
      // Enter code below...
      boolean isTest1Double = Main.isDouble(test1);
      boolean isTest2Double = Main.isDouble(test2);
  
      System.out.println("test1 is double - " + isTest1Double);
      System.out.println("test2 is double - " + isTest2Double);    
    }
  
    public static <T> boolean isDouble (T object) {
      return object instanceof Double;
    }
  }