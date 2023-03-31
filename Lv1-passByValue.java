// As far as Java is concerned, everything is Pass-By-Value

// **Pass-by-value**: when parameter is pass-by-value, the caller and callee method operate on two different variables which are copies of each other. Any changes to one variable don’t modify the other. 

// - While calling a method, **parameters passed to the callee method will be clones of the original parameters**. Any modification done in callee method will have no effect on original in the caller method

// **Pass-by-reference:** When parameter is pass-by-reference, caller and callee operate on same object

// - this means that when variable is pass-by-reference, unique identifier of object is sent to the method. Any changes to parameter’s instance members will result in that change being made to original value

// **Parameter Passing**

// The fundamental concepts in any programming language are “values” and “references”.

// In Java, primitive variables store the actual values, whereas non-primitives store the reference variables, which point to the addresses of objects they referring to. Both values and references are stored in stack memory

// - Arguments in Java are ALWAYS pass-by-value.
// - During method invocation, a copy of each argument, whether its value or reference, is created in stack memory which is then passed to the method
// - In case of primitives, the value is simply copied inside stack memory which is then passed to the callee method; in case of non-primitives, a reference in stack memory points to the actual data which resides in the heap. When we pass an object, the reference in stack memory is copied and the new reference is passed to the method.

// **Primitive**: are data types are the basic data types that are built into the Java language. They are simple, atomic values that cannot be broken down into smaller components(boolean, byte, char, short, int, long, float, double)

// **Non-primitive**(reference data types): are not built into the language, but are instead created using classes, interfaces, or arrays. They are more complex than primitive data types, and can be broken down into smaller components(Classes, interfaces, arrays, enumerations, strings, wrapper classes - Integer, Double, etc) 

// - unlike primitive data types, non primitive data types are always created as objects and they have methods and properties used to manipulate and access their values

public class PrimitivesUnitTest {
	@test
	public void whenModifyingPrimitives_thenOriginalValuesNotModified() {
		int x = 1;
		int y = 2;

		//Before Modification
		assertEquals(x,1);
		assertEquals(y,2);

		modify(x,y);

		//After Modification
		assertEquals(x,1);
		assertEquals(y,2);
}

public static void modify(int x1, int y1) {
		x1 = 5;
		y1 = 10;
	}
}

// Let's try to understand the assertions in the above program by analyzing how these values are stored in memory:

// 1. The variables “*x”* and “*y”* in the main method are primitive types and their values are directly stored in the stack memory
// 2. When we call method *modify()*, an exact copy for each of these variables is created and stored at a different location in the stack memory
// 3. Any modification to these copies affects only them and leaves the original variables unaltered

// **Passing Object References**

// In Java, all objects are dynamically stored in Heap space under the hood. These objects are referred from references called reference variables.

// A Java object, in contrast to Primitives, is stored in two stages. The reference variables are stored in stack memory and the object that they're referring to, are stored in a Heap memory.

// **Whenever an object is passed as an argument, an exact copy of the reference variable is created which points to the same location of the object in heap memory as the original reference variable.**

// **As a result of this, whenever we make any change in the same object in the method, that change is reflected in the original object.** However, if we allocate a new object to the passed reference variable, then it won't be reflected in the original object.

public class NonPrimitivesUnitTest {
    @Test
    public void whenModifyingObjects_thenOriginalObjectChanged() {
        Foo a = new Foo(1);
        Foo b = new Foo(1);
    
        // Before Modification
        assertEquals(a.num, 1);
        assertEquals(b.num, 1);
    
        modify(a, b);
    
        // After Modification
        assertEquals(a.num, 2);
        assertEquals(b.num, 1);
    }
    
    public static void modify(Foo a1, Foo b1) {
        a1.num++;
    
        b1 = new Foo(1);
        b1.num++;
        }
    }
    
    class Foo {
    public int num;
    public Foo(int num) {
        this.num = num;}
    }


// Let's analyze the assertions in the above program. We have passed objects *a* 
// and *b* in *modify()* method that has the same value *1*. Initially, these object references are pointing to two distinct object locations in a heap space:

// When these references *a* and *b* are passed in the *modify()* method, it creates mirror copies of those references *a1* and *b1* which point to the same old objects:

// In the *modify()* method, when we modify reference *a1*, it changes the original object. However, for a reference *b1,* we have assigned a new object. So it's now pointing to a new object in heap memory.

// In this article, we looked at how parameter passing is handled in case of Primitives and Non-Primitives.

// We learned that parameter passing in Java is always Pass-by-Value. However, the context changes depending upon whether we're dealing with Primitives or Objects:

// 1. For Primitive types, parameters are pass-by-value
// 2. For Object types, the object reference is pass-by-value