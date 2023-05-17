class Lib {
	String objType;
	String objName;
	
	//assign values using constructor
	public Lib(String type, String name) {
		this.objType = type;
		this.objName = name;
	}

	//private method
	privateString getObjName() {
		return this.objName;
	}

	//inner class
	class Book {
		String description;
		void setDescription() {
			if(Lib.this.objType.equals("book")) {
				if(Lib.this.getObjName().equals("nonfiction")) {
					this.description = "Factual stories/accounts based on true events.";
					} else {
						this.description = "Literature that is imaginary.";
					} else {
							this.description = "Not a book!";
						}
					}
			String getDescription() {
				return this.description;
			}
		}
	}


public class Main {
	public static void main(String[] args) {
		Lib fiction = new lib("book", "fiction");
		Lib.Book book1 = fiction.new Book();
		book1.setDescription();
		System.out.println("Fiction Book Description = " + book1.getDescription();

		Lib nonFiction = new Lib("book", "nonfiction");
		Lib.Book book2 = nonFiction.new Book();
		book2.setDescription();
		System.out.println("non-fiction Book Description = " + book2.getDescription());
		}
}