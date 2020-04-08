// // Return; double; System.out.printf

// //Calling math methods 
// //Math.methodName(parameters)

// double squareRoot =  Math.sqrt(121.0);
// System.out.println(squareRoot)

// int absoluteValue = Math.abs(-50);
// System.out.println(absoluteValue);

// System.out.println(Math.min(3,7) + 2) //5

// //return: to send out a value as the result of a method
// //the opposite of a parameter:
//     //Parameters send information IN from the caller to the method
//     //return values send information OUT from a method to its caller

// //RETURNING A VALUE:
// public static double slope(int x1, int yl, int x2, int y2) {
//     double dy = y2-y1;
//     double dx = x2 - x1;
//     return dy/dx
// }

// //converts fahrenheit to celsius
// public static double fToC(double degrees F) {
//     double degreesC = 5.0 / 9.0 * (degreesF - 32);
//     return degreesC
// }

// //you can shorten the examples by returning an expression:
// public static double fToC(double degreesF) {
//     return 5.0 / 9.0 * (degreesF - 32)
// }

// //TYPE CASTING
// //A conversion from one type to another
//     //to promote an int to a double to get exact division from /
//     //to truncate a double from real num to an integer
//     double result = (double) 19/5;
//     int result2 = (int) result; //3
//     int x = (int) Math.pow(10, 3) //1000

//     //type casting has a high precedence and only casts the item immediately next to it
//     double x = (double) 1 + 1 / 2;
//     double y = 1 + (double) 1 / 2; //1.5

//     //you can force parentheses to force evaluation order
//     double average = (double) ( a + b + c) + 3;

//     //conversion to double can be achieved in other ways
//     double average = 1.0 * ( a + b + c) / 3;

//     //system.out.printf - an advanced command for printing formatted text
//     //System.out.printf("format string", parameters);
//     //a format string contains placeholders to insert parameters into it:
//     // %d -- an integer
//     //%f -- a real number
//     //%s -- a string

//     int x = 3;
//     int y = 2;
//     System.out.printf("(%d, %d)\n", x, y) // (3, 2)

// //     A placeholder can specify the parameter's width or precision:
// //  %8d an integer, 8 characters wide, right-aligned
// //  %-8d an integer, 8 characters wide, left-aligned
// //  %.4f a real number, 4 characters after decimal
// //  %6.2f a real number, 6 characters wide, 2 after decimal
// //  Examples:
// // int age = 45;
// // double gpa = 1.2345678;
// // System.out.printf("%-8d %4f\n", age, gpa);
// // System.out.printf("%8.3f %.1f %.5f", gpa, gpa, gpa);

// //  Output:
// // 45 1.23
// // 1.234 1.2 1.23457

