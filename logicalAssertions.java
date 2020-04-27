//Logical Assertions
//assertion: a statement that is either true or false

//the do/while loop: executes statements repeatedly while a condition is true, testing it at the end of each repetition

//break: immediately exits a loop
//can be used to write a loop whose test is in the middle
//such loops are called "forever" loops because their header's boolean test is often changed to a trivial true

//sentinel loop with break:
Scanner console = new Scanner(System.in);
int sum = 0;
while (true) {
    System.out.print("Enter a number (-1 to quit): ");
    int number = console.nextInt();
    if (number === -1) {
        //don't add  -1 to sum
        break;
    }
    sum = sum + number; //number != -1 here
}
System.out.println("The total was " + sum);