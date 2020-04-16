///CATEGORIES OF LOOPS
//definite loop: executes a known number of times, like for loops
//indefinite loop: one where the number of times its bosy repeats is not known in advance

//while loop: repeatedly executes its bosy as long as a logical test is true

int num =1;
while (num<= 200) {
    System.out.print (num + " ");
    num = num * 2;
}

//EXAMPLE WITH WHILE LOOP
//finds a number's first factor other than 1
Scanner console = new Scanner(System.in);
System.out.print("Type a number: ");
int number = console.nextInt();//this will take your console input of a number
int factor = 2;
while (number % factor != 0 ) {
    factor++
}
System.out.println("First factor: " + factor);

//while is better than for in this example because we don't know how many times we will need to increment to find the factor

//for vs while loops
//the for loop is just a specialized form of the while loop
for (int num = 1; num <= 200; num = num * 2){
    System.out.print(num + " ");
}

//WHILE AND SCANNER
//while loops are often used with the Scanner input
    //you don't know how many times you'll need to re-prompt the user if they type bad data

//SENTINEL LOOPS
//Sentinel: a value that signals the end of user input
//sentinel loop: repeats until a sentinel value is seen

//write a program that repeatedly prompts the user for words until the user types "goodbye", then outputs the longest word typed

Scanner cnsole = new Scanner(System.in);
String longest = "";
System.out.print("Type a word (or \ "goodbye\" to quit): ");
String word = console.next();

while (!word.equals("goodbye")) {
    if (word.length() > longest.length()) {
        longest = word; //moved to top of the loop
    }
    System.out.print("Type a word (or "\goodbye\" to quit): ");
    word = console.next()
}

System.out.print("The longest word you typed was \"" + longest + "\" (" + longest.length() + " letters)");

//CONSTANT WITH SENTINEL
static final String SENTINEL = "goodbye";

Scanner console = new Scanner(System.in);
System.out.print("Type a word (or \"" + SENTINEL + "\" to quit): ");
String word = console.next();
String longest = "";

while (!word.equals(SENTINEL)) {
    if (word.length() > longest.length()) {
        longest = word;
    }
    System.out.print()
}

System.out.println("The longest word you typed was \"" +
longest + "\" (" + longest.length() + " letters)");

// Solution to the "sum numbers until -1 is typed" problem:
Scanner console = new Scanner(System.in);
int sum = 0;
System.out.print("Enter a number (-1 to quit): ");
int number = console.nextInt();
while (number != -1) {
sum = sum + number; // moved to top of loop
System.out.print("Enter a number (-1 to quit): ");
number = console.nextInt();
}
System.out.println("The sum is " + sum);