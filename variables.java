//Types of variables:
//Local variables, Instance variables, Static variables

//Local variables: A variable defined within a block or method or constructor. Are created when the block in entered or the function is called and destroyed after exiting from 
//the block or when the call returns from the function
//scope only exists within the block in which the variable is declared

class StudentDetails {
    public void StudentAge() {
        //local variable age
        int age = 0;
        age = age + 5;
        System.out.println("Student age is : " + age);
    }

    public static void main(String args[]) {
        StudentDetails obj = new StudentDetails();
        obj.StudentAge();
    }
}

//Instance variables:Are non-static variables and are declared in a class outside any method, constructor or block.
//Declared in a class--created when an object of the class is created and destroyed when obj is destroyed

class Marks {
    //instance variables and are in a class, not ina function
    int engMarks;
    int mathMarks;
    int phyMarks;
}

class MarksDemo {
    public static void main(String args[]) {
        //first object
        Marks obj1 = new Marks();
        obj1.engMarks = 50;
        obj1.mathMarks = 80;
        obj1.phyMarks = 90;

        //second object
        Marks obj2 = new Marks();
        obj2.engMarks = 80;
        obj2.mathMarks = 60;
        obj2.phyMarks = 85;

        //displaying marks for the first object
        System.out.println("Marks for the first object");
        System.out.println(obj1.engMarks);
        System.out.println(obj1.mathMarks);
        System.out.println(obj1.phyMarks);

        //displaying marks for the second object
        System.out.println("Marks for the second object");
        System.out.println(obj2.engMarks);
        System.out.println(obj2.mathMarks);
        System.out.println(obj2.phyMarks);
    }
}

//in case we have multiple objects, each object will have its own copies of instance variables.

//Static variables: class variables. one static variable per class
class Emp {
    //static variable salary
    public static double salary;
    public static String name = "Harsh";
}

class EmpDemo {
    public static void main(String args[]) {
        //accessing static variable without object
        Emp.salary = 1000;
        System.out.println(Emp.name + "'s average salary: " + Emp.salary);
    }
}