//Objects and Classes
//object: an entity that contains data(variables) and behavior(methods)
//class: a program or type of objects
//dot notation:
String msmeow = "Ms. Meow";
System.out.println(msmeow.length()) //7

//to modify a variable, you must reassign it:
String s = "jeicat";
s = s.toUppercase();
System.out.println(s); //JEICAT
//STRINGS AS PARAMETERS

class StringParameters {
    public static void main(String[] args) {
        sayHello("Jess");

        String teacher = "Helene";
        sayHello(teacher);
    }

    public static void sayHello(String name) {
        System.out.println("Welcome, " + name);
    }
}

//STRINGS AS USER INPUT
Scanner console = new Scanner(System.in);
System.out.print("What is your name?");
String name = console.next();
name = name.toUppercase();
System.out.println(name + " has " + name.length() + " letters and starts with "name.substring(0, 1));

//The equals method
// == compares objects by references so it often gives false even when two strings have the same letters

//Type char
//char: a primitive type representing single characters
    //each character inside a String is stored as a char value
    //literalchar values are surrounded by an apostrophe(single-quote) marks, 'a', 'b'

//THE CHARAT METHOD
//the char in a string can be accessed using the charAt method
String food = "cookie";
char firstLetter = food.charAt(0);

System.out.println(firstLetter + " is for " + food);
System.out.println("That's good enough for me!")

//You can use a for loop to print or examine each character
String major = "CSE";
for (int i = 0; i < major.length(); i++){
    char c = major.charAt(i);
    System.out.println(c);
}

//char vs string 
//"h" is a string, 'h' is a char (the two behave differently)

//String is an object; it contains methods 
String s = "h";
s = s.toUpperChase(); //'H'
int len = s.length(); //1
char first = s.charAt(0) //'H'