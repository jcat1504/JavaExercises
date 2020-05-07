//class: a user defined blue print or prototype from which objects are created.it represents set of properties or methods that are common to all objects of one type.
//in general, class declarations can include these components in order:
//1. modifiers: a class can be public or has default access
//2. class name
//3. superclass(if any): class' parent followed by the keyword extends
//4. interfaces(if any): a comma separated list of interfaces implemented by the class. a class can implement more than one interface
//5. body
//constructors are used for initializing new objects
//methods are used to implement the behavior of the class and its objects
//declaring objects(instantiating a class)

//initializing an object
//new operator instantiates a class by allocating memory for a new object and returning a reference to that memory

public class Dog 
{
    //instance variables
    String name;
    String breed;
    int age;
    String color;

    //constructor declaration of class
    public Dog(String name, String breed, int age, String color) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }

    //method 1
    public String getName() {
        return name;
    }

    //method 2
    public String getBreed() {
        return breed;
    }

    //method 3
    public int getAge(){
        return age;
    }

    //method 4
    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return("Hi my name is " + this.getName()+
        ".\nMy breed, age and color are" +
        this.getBreed()+"," + this.getAge()+
        "," + this.getColor());
    }

    public static void main(String[] args) {
        Dog tuffy = new Dog("tuffy", "papillon", 5, "white");
        System.out.println(tuffy.toString());
        //where we print Tuffy's attributes
    }
}

//ways to create an object of a class
//1. use a new keyword
Test t = new Test();
//2. Using Class.forName(String className) method. there is a predefined package with the name Class. 
    //creating object of public class Test
    //consider class Test present in com.p1 package
    Test obj = (Test)Class.forName("com.p1.Test").newInstance();
//3. using the clone() method
    //creating object of the class Test
    Test t1 = new Test();

    //creating clone of above object
    Test t2 = (Test)t1.clone();

    //Deserialization-- a technique of reading an object from the saved state in a file
