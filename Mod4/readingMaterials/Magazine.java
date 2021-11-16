package readingMaterials;

public class Magazine extends ReadingMaterials
{
  public String name, topic, coverHeading;

  //creates a Magazine object
  public Magazine(String name, String topic, String coverHeading,
    String publication, int pages)
  {
    super(publication, pages);
    System.out.println("A magazine was created!");
    this.name = name;
    this.topic = topic;
    this.coverHeading = coverHeading;
  }

  //prints details of the magazine
  public void print()
  {
    System.out.println("-------------------------------");
    System.out.println("Details of the Magazine " + name);
    System.out.println("-------------------------------");
    System.out.println("Name: "+ name);
    System.out.println("Topic: " + topic);
    System.out.println("Cover Heading: " + coverHeading);
    System.out.println("Publication: " + publication);
    System.out.println("No. of pages: " + pages);
    System.out.println("-------------------------------");
  }
}