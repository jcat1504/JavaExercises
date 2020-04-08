//Interactive Programs
//it is possible to read input from the console!
//interactive program: user types input into the console. capture the input and use it in our program

//input and system.in
//System.out -- an object with methods named println and print
//System.in -- not intended to be used directly
//we use a second object from a class Scanner to help us

//constructing a Scanner object to read console input
Scanner name = new Scanner(System.in);

Scanner console = new Scanner(System.in);

//JAVA CLASS LIBRARIES, IMPORT
//Java class libaries: Classes included with Java's JDK.
//organized into groups named packages
//to use a package, put an import declaration into your program
//import packageName.*; <--put this on top of your program
//import java.util.*; <-- Scanner is in this package

//SCANNER METHODS:
// Method Description
// nextInt() reads a token of user input as an int
// nextDouble() reads a token of user input as a double
// next() reads a token of user input as a String
// nextLine() reads a line of user input as a String
System.out.print("How old are you?");
int age = console.nextint();
System.out.println("You'll be 40 in " + (40 - age) + " years");

//EXAMPLE SCANNER USAGE
import java.util 

public class ReadSomeInput {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("How old are you?");
        int age = console.nextInt();

        Syste.out.println(age + "...That's quite old!")
    }
}

//Another Scanner Example
import java util.*

public class ScannerSum {
    public static void main (String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Please type three numbers: ");
        int num1 = console.nextint();
        int num2 = console.nextint();
        int num3 = console.nextint();

        int sum = num1 + num2 + num3;
        System.out.println("the sum is " + sum)

    }
}

//LEFT OFF AT: INPUT TOKENS