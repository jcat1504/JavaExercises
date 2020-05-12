//HOW ARE JAvA OBJECTS STORED IN MEMORY?
//ALL OBJECTS ARE DYNAMICALLY ALLOCATED IN A HEAP
//when we only declare a variable of a class type, only a reference is created(memory is not allocated for the object)
//to allocate memory to an object: use new();

//DIFFERENT WAYS TO CREATE JAVA OBJECTS
//1. using 'new' keywor
public static void main(String[], args) {
    NewKeyWord = new NewKeyword();
}

//2. Creating new instance 
//if we know name of the class and it has public default constructor, we can create an Object of a Class
//Class.forName loads class in Java but does not create any object. You must use new instance method

//3. clone method--does not invoke on any constructor

//4. Deserialization--whenever we serialize or deserialize, JVM creates a seperate object. no constructor needed
//6. using newInstance() method of constructor class. There is one newInstance() method in the java.lang.reflect.Constructor class which 
//we can use to create objects. It can also call parameterized constructor, and private constructor by using this newInstance() method.

//Both newInstance() methods are known as reflective ways to create objects. In fact newInstance() method of Class internally uses newInstance() method of Constructor class.

// Java program to illustrate creation of Object 
// using newInstance() method of Constructor class 
import java.lang.reflect.*; 
  
public class ReflectionExample 
{ 
    private String name; 
    ReflectionExample() 
    { 
    } 
    public void setName(String name) 
    { 
        this.name = name; 
    } 
    public static void main(String[] args) 
    { 
        try
        { 
            Constructor<ReflectionExample> constructor 
                = ReflectionExample.class.getDeclaredConstructor(); 
            ReflectionExample r = constructor.newInstance(); 
            r.setName("GeeksForGeeks"); 
            System.out.println(r.name); 
        } 
        catch (Exception e) 
        { 
            e.printStackTrace(); 
        } 
    } 
} 