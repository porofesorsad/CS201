package book;

import java.util.Arrays;

public class Volume 
{
	private String volumeName;
	private int numberOfBooks;
	Book[] books = new Book[numberOfBooks];
	
	public Volume(Book books[], int numberOfBooks, String volumeName)
	{
		this.books = books;
		this.numberOfBooks = numberOfBooks;
		this.volumeName = volumeName;
	}
	
	public String getBookArray()
	{
		String booklist = "";
		for(Book b: books)
			booklist += b + "\n";
		return booklist;
	}
	
	public String toString()
	{
		//return Arrays.toString(books) + "\n" + "Books in series: " 
		//		+ numberOfBooks + ", Volume name: " + volumeName + "]";
		return "Volume: " + volumeName + "\n" + getBookArray();
	}
	
}
