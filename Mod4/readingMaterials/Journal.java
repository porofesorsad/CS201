package readingMaterials;

public class Journal extends ReadingMaterials
{
  public String name, coverHeading;

  //creates a journal
  public Journal(String name, String coverHeading,
    String publication, int pages)
  {
    super(publication, pages);
    System.out.println("A journal was created!");
    this.name = name;
    this.coverHeading = coverHeading;
  }

  //prints details about the journal
  public void print()
  {
    System.out.println("-------------------------------");
    System.out.println("Details of journal " + this.name);
    System.out.println("-------------------------------"); 
    System.out.println("Title: " + this.name);
    System.out.println("Author: " + this.coverHeading);
    System.out.println("Publication: " + this.publication);
    System.out.println("No. of pages: " + this.pages);
    System.out.println("-------------------------------");
  }
}