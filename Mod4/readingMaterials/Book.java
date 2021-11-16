package readingMaterials;

public class Book extends ReadingMaterials
{
  public String title, author;
  public Book(String title, String author, String publication, int pages)
  {
    super(publication, pages);
    System.out.println("A book was created!");
    this.title = title;
    this.author = author;
  }

  public void print()
  {
    System.out.println("-------------------------------");
    System.out.println("Details of book " + this.title); 
    System.out.println("-------------------------------");
    System.out.println("Title: " + this.title);
    System.out.println("Author: " + this.author);
    System.out.println("publication: " + this.publication);
    System.out.println("No. of pages: " + this.pages);
    System.out.println("-------------------------------");
  } 
}
