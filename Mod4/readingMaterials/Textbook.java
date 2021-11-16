package readingMaterials;

public class Textbook extends Book
{
  String subject;

  //creates a textbook
  public Textbook(String subject, String title, String author,
    String publication, int pages)
  {
    super(title, author, publication, pages);
    System.out.println("A book was created!");
    this.subject = subject;
  }

  //displays details of a textbook
  public void print()
  {
    System.out.println("-------------------------------");
    System.out.println("Details of textbook " + this.title); 
    System.out.println("-------------------------------");
    System.out.println("Title: " + this.title);
    System.out.println("Author: " + this.author);
    System.out.println("Subject: " + this.subject);
    System.out.println("publication: " + this.publication);
    System.out.println("No. of pages: " + this.pages);
    System.out.println("-------------------------------");
  }
}
