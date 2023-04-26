import java.util.TreeSet;

public class Example {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();

        treeSet.add("dog");
        treeSet.add("cat");
        treeSet.add("fish");

        System.out.println(treeSet); // [cat, dog, fish]

        System.out.println(treeSet.contains("dog")); // true

        treeSet.remove("cat");

        System.out.println(treeSet); // [dog, fish]
    }
}