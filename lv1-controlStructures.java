//control structures are programming blocks that can change the path we take through those instructions
//three kinds of control structures:
//1. conditional branches: choosing between two or more paths. 3 types: if/else/else if, 
//ternary operator, switch
//2. loops -   used to iterate through multiple values/objs and repeatedly run specific code blocks
//3. Branching statements - used to alter the flow of control in loops: break and continue

if (count > 2) {
    System.out.println("Count is higher than 2");
} else {
    System.out.println("Count is lower or equal than 2");
}

//Ternary operator
System.out.println(count > 2 ? "Count is higher than 2" : "Count is lower or equal than 2");

//Switch 
int count = 3;
switch (count) {
    case 0:
    System.out.println("Count is equal to 0");
    break;
    case 1: 
    System.out.println("Count is equal to 1");
    break;
    default:
    System.out.println("Count is either negative, or higher than 1");
    break;
}

//LOOPS!

for (int i = 1; i <= 50; i++ ) {
    methodToRepeat();
}

int whileCounter = 1;
while (whileCounter <= 50) {
    methodToRepeat();
    whileCounter++;
}

//both code blocks above will call methodToRepeat 50 times

//BREAK!
List<String> names = getNameList();
String name = "John Doe";
int index = 0;
for ( ; index < names.length; index++) {
    if (names[index].equals(name)) {
        break;
    }
}

//CONTINUE!
List<String> names = getNameList();
String name = "Jess";
String list = "";
for (int = 0; i < names.length; i++) {
    if (names[i].equals(name)) {
        continue;
    }
    list+= names[i];
}

//if (names[i].equals(name)) - this checks whether the current element of the `names` list,
// at the index indicated by `i` is equal to the `name` variable that was defined earlier
// the equals() method is used to compare the strings, which checks if they have same value

// `continue` if the current element of the `names` list is equal to the `name` variable,
//then the `continue` statement is executed, which skips the current iteration of the loop and moves
//to next one

//`list+= names[i] - if the current element of the `names` list is not equal to the `name` variable,
// then the string value of the current element is appended to the `list` variable using the += operator
//this builds a new string that excludes the name specified in the `name` variable