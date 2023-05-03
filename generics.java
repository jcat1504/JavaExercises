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