import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> fruits = new HashSet<>();

        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        fruits.add("date");
        fruits.add("elderberry");

        // Iterating over a HashSet using for-each loop
        System.out.println("Fruits in the HashSet:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}

import java.util.HashSet;

public class FruitSet {
    public static void main(String[] args) {
        HashSet<String> fruitSet = new HashSet<>();
        fruitSet.add("Apple");
        fruitSet.add("Banana");
        fruitSet.add("Orange");

        // Search for an element in the set
        String search = "Banana";
        if (fruitSet.contains(search)) {
            System.out.println(search + " is found in the set.");
        } else {
            System.out.println(search + " is not found in the set.");
        }
    }
}
