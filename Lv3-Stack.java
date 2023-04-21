public static void main(String[] args)
	Stack<String> stack = new Stack<String>();

		//System.out.println(stack.empty());
		stack.push("Minecraft");
		stack.push("Skyrim");
		stack.push("DOOM");
		stack.push("Borderlands")
		stack.push("FFVII");

	String myFavGame= stack.pop();
	
	System.out.println(stack);
	System.out.println(myFavGame);

//prints:
// [Minecraft, Skyrim, DOOM, Borderlands]
// FFVII

//Peek will look at the top most item in stack and return it
System.out.println(stack.peek());
//FFVII

//Search will search for specific element in array
System.out.println(stack.search("FFVII"));
//1