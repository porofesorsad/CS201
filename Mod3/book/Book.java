package book;
//Yasmin Torres Module 3
public class Book 
{
	private String title;
	private String author;
	private int numberOfPages = 0;
	public Book(String title, String author, int numberOfPages)
	{
		//super();
		this.title = title;
		this.author = author;
		this.numberOfPages = numberOfPages;
	}

	public String toString()
	{
		return "Book:" + title + ", Author: " + author
				+ ", Length " + numberOfPages + " pages.";
	}
}
