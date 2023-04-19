//the keyword this is useful for disambiguating instance variables from local parameters. The most common reason is when we have constructor parameters with the same name as instance fields 
public class KeywordTest {
	private String name;
	private int age;

	public KeywordTest(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

//Referencing Constructors of the same Class
public KeywordTest(String name, int age) {
	this();
	//rest of the code
}

public KeywordTest() {
	this("John", 27);
}

//passing 'this' as a parameter
public KeywordTest() {
	printInstance(this);
}

public void printInstance(KeywordTest thisKeyword) {
	System.out.println(thisKeyword);
}

//The this keyword within the inner class - we can also use this to access the outer class instance from within the inner class:
public class KeywordTest {
	private String name;
	class ThisInnerClass {
		boolean isInnerClass = true;

		public ThisInnerClass() {
			KeywordTest thisKeyword = KeywordTest.this;
			String outerString = KeywordTest.this.name;
			}
		}
}

