package readingMaterials;

public class TechnicalJournal extends Journal
{
  public String subject, topic;

  //Creates a technical journal
  public TechnicalJournal(String name, String subject, String topic,
    String publication, int pages, String coverHeading)
  {
    super(name, coverHeading, publication, pages);
    System.out.println("A technical journal was created!");
    this.subject = subject;
    this.topic = topic;
  }

  //prints details about technical journal
  public void print()
  {
    System.out.println("-------------------------------");
    System.out.println("Details of the journal " + name);
    System.out.println("-------------------------------");
    System.out.println("Name: "+ name);
    System.out.println("Name: "+ subject);
    System.out.println("Topic: " + topic);
    System.out.println("Publication: " + publication);
    System.out.println("No. of pages: " + pages);
    System.out.println("-------------------------------");
  }
}
