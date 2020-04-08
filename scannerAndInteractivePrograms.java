//Interactive Programs
//it is possible to read input from the console!
//interactive program: user types input into the console. capture the input and use it in our program

//input and system.in
//System.out -- an object with methods named println and print
//System.in -- not intended to be used directly
//we use a second object from a class Scanner to help us

//constructing a Scanner object to read console input
// Scanner name = new Scanner(System.in);

// Scanner console = new Scanner(System.in);

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
// System.out.print("How old are you?");
// int age = console.nextint();
// System.out.println("You'll be 40 in " + (40 - age) + " years");

//EXAMPLE SCANNER USAGE
// import java.util 

// public class ReadSomeInput {
//     public static void main(String[] args) {
//         Scanner console = new Scanner(System.in);

//         System.out.print("How old are you?");
//         int age = console.nextInt();

//         System.out.println(age + "...That's quite old!")
//     }
// }

//Another Scanner Example
// import java util.*

// public class ScannerSum {
//     public static void main (String[] args) {
//         Scanner console = new Scanner(System.in);

//         System.out.print("Please type three numbers: ");
//         int num1 = console.nextint();
//         int num2 = console.nextint();
//         int num3 = console.nextint();

//         int sum = num1 + num2 + num3;
//         System.out.println("the sum is " + sum)

//     }
// }

//LEFT OFF AT: INPUT TOKENS
//token: a unit of user input as read by the Scanner. they are separated by white spaces


//SCANNERS AS PARAMETERS
//if many methods read input, declare a Scanner in main and pass it to the others as a param
// public static void main(String[] args) {
//     Scanner console = new Scanner(System.in);
//     int sum = readSum3(console);
//     System.out.println("The sum is " + sum);
// }

//prompts for 3 numbers and returns their sum
// public static int readSum3(Scanner console) {
//     System.out.print("Type 3 numbers: ");
//     int num1 = console.nextInt();
//     int num2 = console.nextInt();
//     int num3 = console.nextInt();
//     return num1 + num2 + num3;
// }

//SCANNER AND CUMULATIVE SUM
// Scanner console = new Scanner(System.in);
// int sum = 0;
// for (int i = 1; i <= 100; i++) {
//     sum = sum + console.nextInt();
// }
// System.out.println("The sum is " + sum)