// // Methods in Java
// // A method is a collection of statements that perform some specific task and return the result to the caller. 
// A method can perform some specific task without returning anything. Methods allow us to reuse the code without retyping the code. 
// In Java, every method must be part of some class which is different from languages like C, C++, and Python.
// // Methods are time savers and help us to reuse the code without retyping the code.

// // Method Declaration

// // In general, method declarations has six components :



// // Modifier-: Defines access type of the method i.e. from where it can be accessed in your application. In Java, there 4 type of the access specifiers.
// // public: accessible in all class in your application.
// // protected: accessible within the class in which it is defined and in its subclass(es)
// // private: accessible only within the class in which it is defined.
// // default (declared/defined without using any modifier) : accessible within same class and package within which its class is defined.
// // The return type : The data type of the value returned by the method or void if does not return a value.
// // Method Name : the rules for field names apply to method names as well, but the convention is a little different.
// // Parameter list : Comma separated list of the input parameters are defined, preceded with their data type, within the enclosed parenthesis. If there are no parameters, you must use empty parentheses ().
// // Exception list : The exceptions you expect by the method can throw, you can specify these exception(s).
// // Method body : it is enclosed between braces. The code you need to be executed to perform your intended operations.

class Addition { 
      
    int sum = 0; 
      
    public int addTwoInt(int a, int b){ 
          
        // adding two integer value. 
        sum = a + b; 
          
        //returning summation of two values. 
        return sum;  
    } 
      
} 
  
class GFG { 
    public static void main (String[] args) { 
      
        // creating an instance of Addition class  
        Addition add = new Addition(); 
          
        // calling addTwoInt() method to add two integer using instance created 
        // in above step. 
        int s = add.addTwoInt(1,2); 
        System.out.println("Sum of two integer values :"+ s); 
          
    } 
} 