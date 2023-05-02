import java.util.*;

public class Main {
    public static void main(String[] args) {
        TreeMap<String, Integer> fruitCount = new TreeMap<>();
        fruitCount.put("apple", 5);
        fruitCount.put("banana", 10);
        fruitCount.put("orange", 7);
        fruitCount.put("pineapple", 3);

        // Iterating over the entries of the TreeMap
        for (Map.Entry<String, Integer> entry : fruitCount.entrySet()) {
            String fruit = entry.getKey();
            int count = entry.getValue();
            System.out.println(fruit + " - " + count);
        }
    }
}
