// - ArrayList is a generic class, so you can parameterize it with any type you want and compiler will ensure that for example, you will not be able to put Integer values inside a collection of Strings! And you don’t need to cast elements when retrieving them from a collection
// - its good practice to use generic interface List as a variable type because it decouples it from a particular implementation


List<String> list = new ArrayList<> ();
assertTrue(list.Empty());


// An empty ArrayList instance^^


List<String> list = new ArrayList<>(20);


// Determining an initial length of an array could help with avoiding unnecessary resizing when adding in new items

// **Constructor Accepting Collection**


Collection<Integer> numbers = 
	IntStream.range(0,10).boxed().collect(toSet());

List<Integer> list = new ArrayList<>(numbers);
assertEquals(10, list.size());
assertTrue(numbers.containsAll(list));


// **Add elements to the ArrayList**

// you may insert an element either at the end or at the specific location

List<long> list = new ArrayList<>();

list.add(1L);
list.add(2L);
list.add(3L);

assertThat(Arrays.asList(1L, 3L, 2L), equalTo(list));


// You may also insert a collection or several elements at once: 


List<Long> list = new ArrayList<>(Arrays.asList(1L,2L,3L));
LongStream.range(4,10).boxed()
	.collect(collectingAndThen(toCollection(ArrayList::new), ys -> list.addAll(0, ys)));
assertThat(Arrays.asList(4L, 5L, 6L, 7L, 8L, 9L, 1L, 2L, 3L), equalTo(list));


// **Iterating over ArrayList**

// - there are two types of iterators: Iterator and ListIterator

// While the former gives you an opportunity to traverse the list in one direction, the latter allows you to traverse it in both directions

List<Integer> list = new ArrayList<>(
	IntStream.range(0,10).boxed().collect(toCollection(ArrayList::new))
);
ListIterator<Integer> it = list.listIterator(list.size());
List<Integer> result = new ArrayList<> (list.size());
while (it.hasPrevious()) {
	result.add(it.previous());
}

Collections.reverse(list);
assertThat(result, equalTo(list));


// Line by Line:

// - Creates a new list of integers, “list” and populate it with numbers 0-9 using a stream

List<Integer> list = new ArrayList<>(
  IntStream.range(0, 10).boxed().collect(toCollection(ArrayList::new))
);


// **Search the ArrayList**

List<String> list = LongStream.range(0, 16)
	.boxed()
	.map(Long::toHexString)
	.collect(toCollection(ArrayList::new));

List<String> stringsToSearch = newArrayList<>(list);
stringsToSearch.addAll(list)

// So the code creates a list of hexadecimal strings representing the numbers from 0 to 15 using **`LongStream`** and the **`toHexString`** method. It then creates a new **`ArrayList`** called **`stringsToSearch`** and copies the elements of the **`list`** into it. Finally, it appends the elements of the **`list`**to the end of the **`stringsToSearch`**list, effectively doubling its size.

// **Searching an Unsorted List**

// In order to find an element, you may use indexOf() or lastIndexOf() methods. They both accept an object and return int value:


assertEquals(10, stringsToSearch.indexOf("a"));
assertEquals(26, stringsToSearch.lastIndexOf("a"));



Iterator<String> it = stringsToSearch.iterator();
Set<String> matchingStrings = new HashSet<> (Arrays.asList("a", "c", "9"));

List<String> result = new ArrayList<> ();
while (it.hasNext()) {
	String s = it.next();
	if (matchingStrings.contains(s)) {
		result.add(s);
	}
}


// **Line by Line**


Iterator<String> it = stringsToSearch.iterator();


// This creates an **`Iterator`**object for the **`stringsToSearch`** list. An **`Iterator`**
//  is an object that can be used to iterate through the elements of a collection (in this case, the **`stringsToSearch`** list).

Set<String> matchingStrings = new HashSet<>(Arrays.asList("a", "c", "9"));

// This creates a **`Set`** of **`String`**objects called **`matchingStrings`** that contains the strings "a", "c", and "9". A **`Set`**is a collection that contains no duplicate elements.

List<String> result = new ArrayList<>();

// This creates a new empty **`ArrayList`**called **`result`**that will be used to store the matching strings.

while (it.hasNext()) {
	String s = it.next();

// This starts a **`while`**loop that will iterate as long as there are more elements in the **`stringsToSearch`**
//  list. This gets the next element from the **`stringsToSearch`** list using the **`next()`** method of the **`Iterator`** object, and assigns it to a **`String`** variable called **`s`**.

if (matchingStrings.contains(s)) {
    result.add(s);
}

// This checks if the **`matchingStrings`** set contains the **`String`** value stored in **`s`**. If it does, the **`String`** value is added to the **`result`** list using the **`add()`** method of the **`ArrayList`**

// So overall, this code is iterating through the **`stringsToSearch`**list using an **`Iterator`**, checking if each string is in the **`matchingStrings`** set, and adding the matching strings to a new list called **`result`**

// **Searching a Sorted List**

// If you have a sorted array, then you may use binary search which works faster than linear search:

List<String> copy = new ArrayList<>(stringsToSearch);
Collections.sort(copy)
int index = Collections.binarySearch(copy, "f");
assertThat(index, not(equalTo(-1)));

// **Remove Elements from the ArrayList**

// In order to remove an element, you should find its index and only then perform the removal via remove() method. An overloaded version of this method that accepts an obect, searches for it and performs removal of the first occurrence of an equal element

List<Integer> list = new ArrayList<> (
	IntStream.range(0,10).boxed().collect(toCollection(ArrayList::new))
);
Collections.reverse(list)

list.remove(0);
assertThat(list.get(0), equalTo(8));

list.remove(Integer.valueOf(0));
assertFalse(list.contains(0));

// But be careful when working with boxed types such as Integer. In order to remove a particular element, you should first box int value or otherwise, an element will be removed by its index.

// You may as well use the aforementioned Stream API for removing several items, but we won’t show it here. For this purpose we will use an iterator:

Set<String> matchingStrings
	= HashSet<>(Arrays.asList("a", "b", "c", "d", "e", "f"));

Iterator<String> it = stringsToSearch.iterator();
	while (it.hasNext()) {
		if (matchingStrings.contains(it.next()))) {
			it.remove();
	}
}

// Overall, this code is used to remove any elements from the **`stringsToSearch`** list that are also present in the **`matchingStrings`** set. It does this by iterating over the elements of the list using an **`Iterator`**, and removing any elements that match elements in the set using the **`remove()`**method of the iterator.

import java.util.ArrayList;

public class ExampleArrayList {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> list = new ArrayList<String>();

        // Add elements to the ArrayList
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        // Print out the contents of the ArrayList
        System.out.println("ArrayList: " + list);

        // Access elements by index
        System.out.println("Element at index 1: " + list.get(1));

        // Modify an element
        list.set(2, "Grape");

        // Remove an element
        list.remove(0);

        // Print out the contents of the modified ArrayList
        System.out.println("Modified ArrayList: " + list);
    }
}

import java.util.ArrayList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Durian");
        
        ListIterator<String> iterator = list.listIterator();
        
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

List<String> list = new ArrayList<>();
list.add("one");
list.add("two");
list.add("three");

ListIterator<String> iterator = list.listIterator(list.size());
while (iterator.hasPrevious()) {
    String element = iterator.previous();
    System.out.println(element);
}

import java.util.ArrayList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        fruits.add("date");
        
        ListIterator<String> iterator = fruits.listIterator(fruits.size());
        System.out.println("Fruits (in reverse order):");
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }
}

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<String> fruits = new ArrayList<>();
    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Orange");
    fruits.add("Mango");

    String search = "Banana";
    int index = fruits.indexOf(search);

    if (index == -1) {
      System.out.println(search + " is not found in the list");
    } else {
      System.out.println(search + " is found at index " + index);
    }
  }
}
