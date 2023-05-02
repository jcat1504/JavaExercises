import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> fruits = new HashMap<>();
        fruits.put("Apple", 3);
        fruits.put("Banana", 5);
        fruits.put("Cherry", 2);
        fruits.put("Durian", 1);
        
        // Iterating over HashMap using forEach() method
        System.out.println("Iterating over HashMap using forEach() method:");
        fruits.forEach((k, v) -> System.out.println("Fruit: " + k + ", Quantity: " + v));
        
        // Iterating over HashMap using entrySet() method
        System.out.println("\nIterating over HashMap using entrySet() method:");
        for (Map.Entry<String, Integer> entry : fruits.entrySet()) {
            System.out.println("Fruit: " + entry.getKey() + ", Quantity: " + entry.getValue());
        }
        
        // Iterating over HashMap using keySet() method
        System.out.println("\nIterating over HashMap using keySet() method:");
        for (String fruit : fruits.keySet()) {
            System.out.println("Fruit: " + fruit + ", Quantity: " + fruits.get(fruit));
        }
    }
}
