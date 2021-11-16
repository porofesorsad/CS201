package readingMaterials;

public class Novel extends Book
{
  String genre;

  //Creates a novel object
  public Novel(String title, String author, String genre,
    String publication, int pages)
  {
    super(title, author, publication, pages);
    System.out.println("A novel was created!");
    this.genre = genre;
  }

  //Prints details about novel
  public void print()
  {
    System.out.println("-------------------------------");
    System.out.println("Details of the novel " + title);
    System.out.println("-------------------------------");
    System.out.println("Name: "+ title);
    System.out.println("Author: "+ author);
    System.out.println("Genre: "+ genre);
    System.out.println("Publication: " + publication);
    System.out.println("No. of pages: " + pages);
    System.out.println("-------------------------------");
  }
}