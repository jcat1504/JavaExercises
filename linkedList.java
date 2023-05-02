LinkedList<String> linkedList = new LinkedList<>();
linkedList.add("apple");
linkedList.add("banana");
linkedList.add("cherry");

Iterator<String> iterator = linkedList.iterator();
while (iterator.hasNext()) {
    String element = iterator.next();
    System.out.println(element);
}

LinkedList<String> linkedList = new LinkedList<>();
linkedList.add("apple");
linkedList.add("banana");
linkedList.add("cherry");

ListIterator<String> listIterator = linkedList.listIterator();
while (listIterator.hasNext()) {
    String fruit = listIterator.next();
    System.out.println(fruit);
}

// Iterate backwards
while (listIterator.hasPrevious()) {
    String fruit = listIterator.previous();
    System.out.println(fruit);
}

LinkedList<String> linkedList = new LinkedList<>();
linkedList.add("apple");
linkedList.add("banana");
linkedList.add("orange");

boolean containsApple = linkedList.contains("apple");
boolean containsGrape = linkedList.contains("grape");

System.out.println("Does the linked list contain 'apple'? " + containsApple);
System.out.println("Does the linked list contain 'grape'? " + containsGrape);

LinkedList<String> linkedList = new LinkedList<>();
linkedList.add("apple");
linkedList.add("banana");
linkedList.add("orange");

int indexApple = linkedList.indexOf("apple");
int indexGrape = linkedList.indexOf("grape");

System.out.println("The index of 'apple' in the linked list is: " + indexApple);
System.out.println("The index of 'grape' in the linked list is: " + indexGrape);
