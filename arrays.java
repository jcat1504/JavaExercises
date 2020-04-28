// // Arrays in Java
// // An array is a group of like-typed variables that are referred to by a common name.
// Arrays in Java work differently than they do in C/C++. Following are some important point about Java arrays.

// // In Java all arrays are dynamically allocated.(discussed below)
// // Since arrays are objects in Java, we can find their length using member length. This is different from C/C++ where we find length using sizeof.
// // A Java array variable can also be declared like other variables with [] after the data type.
// // The variables in the array are ordered and each have an index beginning from 0.
// // Java array can be also be used as a static field, a local variable or a method parameter.
// // The size of an array must be specified by an int value and not long or short.
// // The direct superclass of an array type is Object.
// // Every array type implements the interfaces Cloneable and java.io.Serializable.
// // Array can contains primitives (int, char, etc) as well as object (or non-primitives) references of a class depending on the definition of array.
//  In case of primitives data types, the actual values are stored in contiguous memory locations. In case of objects of a class, the actual objects are 
//  stored in heap segment.

int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 }; 
 // Declaring array literal

// Here, type specifies the type of data being allocated, size specifies the number of elements in the array, and var-name 
// is the name of array variable that is linked to the array. That is, to use new to allocate an array, you must specify the 
// type and number of elements to allocate.

// Example:

int intArray[];    //declaring array
intArray = new int[20];  // allocating memory to array
OR

int[] intArray = new int[20]; // combining both statements in one


// The elements in the array allocated by new will automatically be initialized to zero (for numeric types), false (for boolean), 
// or null (for reference types).Refer Default array values in Java
// Obtaining an array is a two-step process. First, you must declare a variable of the desired array type. Second, you must allocate 
// the memory that will hold the array, using new, and assign it to the array variable. Thus, in Java all arrays are dynamically allocated.

// Accessing Java Array Elements using for Loop

// Each element in the array is accessed via its index. The index begins with 0 and ends at (total array size)-1. 
// All the elements of array can be accessed using Java for Loop.

 
// accessing the elements of the specified array
for (int i = 0; i < arr.length; i++)
  System.out.println("Element at index " + i + " : "+ arr[i]);

class GFG  
{ 
    public static void main (String[] args)  
    {          
      // declares an Array of integers. 
      int[] arr; 
          
      // allocating memory for 5 integers. 
      arr = new int[5]; 
          
      // initialize the first elements of the array 
      arr[0] = 10; 
          
      // initialize the second elements of the array 
      arr[1] = 20; 
          
      //so on... 
      arr[2] = 30; 
      arr[3] = 40; 
      arr[4] = 50; 
          
      // accessing the elements of the specified array 
      for (int i = 0; i < arr.length; i++) 
         System.out.println("Element at index " + i + " : "+ arr[i]);           
    } 
} 
// Output:

// Element at index 0 : 10
// Element at index 1 : 20
// Element at index 2 : 30
// Element at index 3 : 40
// Element at index 4 : 50