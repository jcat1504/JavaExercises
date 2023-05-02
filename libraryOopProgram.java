import java,util.ArrayList;
import java.util.List;

public class Libary { 
	private String name;
	private List<Book> books;

	public Library(String name) {
		this.name = name;
		this.books = new ArrayList<>();
	}
	public String getName() {
		return name;
	}
	public void addBook(Book book) {
		books.add(book);
	}
	public void removeBook(Book book) {
		books.remove(book);
	}

	public List<Book> searchByTitle(String title) {
		List<Book> results = new ArrayList<>();
		for (Book book: books) {
			if(book.getTitle().equals(title)) {
				results.add(book);
				}
			}
		return results;
	}

	public List<Book> searchByGenre(String genre) {
		List<Book> results = new ArrayList<>();
		for(Book book : books) {
			if(book.getGenre().equals(genre)) {
				results.add(book);
				}
			}
		return results;
	}

	public List<Book> getAllBooks() {
		return books;
		}
	}

public class Book {
	private String title;
	private String author;
	private String genre;
	private int numPages;

	public Book(String title, String author, String genre, int numPages) {
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.numPages = numPages;
	}

public String getTitle() {
	return title;
}

public String getAuthor() {
	return author;
}

public String getGenre() {
	return genre;
}

public int getNumPages() {
	return numPages;
}

import java.util.TreeSet;

public class Library {
	private TreeSet<Book> books;
	public Library() {
		this.books = new TreeSet<>();
	}

public void addBook(Book book) {
	this.books.add(book);
}

public void removeBook(Book book) {
	this.books.remove(book);
}

public void printBooks() {
	for(Book book : this.books) {
		System.out.println(book);
	}
}

public void printBooksAlpha() {
	TreeSet<Book> booksSorted = new TreeSet<>(this.books);
	System.out.println("Books sorted by title:");
	for(Book book : booksSorted) {
		System.out.println(book);
	}
}