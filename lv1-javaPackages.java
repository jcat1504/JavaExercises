//OVERVIEW
//Packages are for group related classes, interfaces and sub packages 
//BENEFITS
// - Making related types easier to find - packages contain types that are logically related 
// - avoid naming conflicts - a package will help us to uniquely identify a class
// - controlling access -- we can control visibility and access to types by combining packages and access 
//modifiers

package com.baeldung.packages

// **It is highly recommended to place each new type in a package!~** if we define types and don’t put them in package, they will go in default package or unnamed package.

// Which means:

// - We lose the benefits of having a package structure and we can't have sub-packages
// - We can't import the types in the default package from other packages
// - The ***[protected* and *package-private*](https://www.baeldung.com/java-access-modifiers)** access scopes would be meaningless

// **We should avoid unnamed or default packages in real world applications**

// **Naming Conventions!**

// In order to avoid packages with the same name, we follow some naming conventions:

// - we define our package **names in all lower case**
// - package names are period-delimited
// - names are also determined by **the company or organization that creates them**

// **Directory Structure**

// Packages in Java correspond with a directory structure.

// **Each package and subpackage has its own directory.** So, for the package *com.baeldung.packages*, we should have a directory structure of *com -> baeldung -> packages*.

// Most IDE's will help with creating this directory structure based on our package names, so we don't have to create these by hand.

// **Using Package Members**

// We create class **TodoItem** with subpackage named *domain*
package com.baeldung.packages.domain;

public class TodoItem {
private Long id;
private String description;

//standard getters and setters
}

// **Private Variables -** 

// - In Java, private variables are instance variables that can only be accessed within the class in which they are defined.

// When you define a variable as private, you are restricting its visibility, meaning that it can only be accessed from within the same class. This is a way of encapsulating data and preventing external code from directly accessing or modifying the internal state of an object.

// This is an important principle in object-oriented programming, because it helps to ensure that the state of an object is always valid and consistent. By hiding the implementation details of an object, you can prevent other parts of the program from unintentionally corrupting its state.

// To access or modify a private variable from outside the class, you typically use public methods that are provided by the class, such as getters and setters. These methods provide controlled access to the private variables and allow you to enforce any necessary constraints or business logic.

// **Imports**

// In order to use our *TodoItem* class from a class in another package, we need to import it. Once it's imported, we can access it by name.

// **We can import a single type from a package or use an asterisk to import all of the types in a package.**

// Let's import the entire *domain* subpackage:
import com.baeldung.packages.domain.*;Copy
import com.baeldung.packages.domain.TodoItem;

// The JDK and other Java libraries also come with their own packages. **We can import pre-existing classes that we want to use in our project in the same manner.**

// For example, let's import the Java core *List* interface and *ArrayList* class:

// ```java
// import java.util.ArrayList;import java.util.List;
// ```

// **We can then use these types in our application by simply using their name:**

public class TodoList {
	private List<TodoItem> todoItems;

public void addTodoItem(TodoItem todoItem) {
	if (todoItems == null) {
			todoItems = new ArrayList<TodoItem>();
				}
	todoItems.add(todoItem);
	}
}


// This code defines a class called **`TodoList`** which has a private member variable called **`todoItems`** that is a list of **`TodoItem`** objects.

// The class has a public method called **`addTodoItem`** which takes a **`TodoItem`** object as input and adds it to the **`todoItems`** list. If the **`todoItems`** list is currently null, the method first initializes it to a new empty **`ArrayList`** of **`TodoItem`** objects before adding the new **`TodoItem`** object to the list.

// Essentially, this code allows you to create a **`TodoList`** object, and add **`TodoItem`** objects to it using the **`addTodoItem`** method. The **`TodoList`** object can store multiple **`TodoItem`** objects and the **`addTodoItem`** method ensures that the new **`TodoItem`** is added to the list of **`TodoItems`**.

// - TodoItem is type of parameter, todoItem is name of parameter!

// **Compiling with javac**

// When it's time to compile our packaged classes, we need to remember our directory structure. Starting in the source folder, we need to tell *javac* where to find our files.

// We need to compile our *TodoItem* class first because our *TodoList* class depends on it.

// Let's start by opening a command line or terminal and navigating to our source directory.

// Now, let's compile our *com.baeldung.packages.domain.TodoItem* class:


>javac com/baeldung/packages/domain/TodoItem.javaCopy


// If our class compiles cleanly, we'll see no error messages and a file *TodoItem.class* should appear in our *com/baeldung/packages/domain* directory.

// For types that reference types in other packages, we should use the *-classpath* flag to tell the *javac* command where to find the other compiled classes.

// Now that our *TodoItem* class is compiled, we can compile our *TodoList* and *TodoApp* classes:


>javac -classpath . com/baeldung/packages/*.javaCopy


Again, we should see no error messages and we should find two class files in our *com/baeldung/packages* directory.

Let's run our application using the fully qualified name of our *TodoApp* class:

>java com.baeldung.packages.TodoApp
