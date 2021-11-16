package readingMaterials;
public class ReadingMaterials
{
	String publication;
	int pages  = 0;

	public ReadingMaterials(String publication, int pages)  
	{
 this.publication = publication;
 this.pages = pages;
	} 

	public void print()
	{
 System.out.println("-------------------------------");
 System.out.println("Details of reading material: ");
 System.out.println("-------------------------------"); 
 System.out.println("publication: " + this.publication);
 System.out.println("No. of pages: " + this.pages);
	}
}

