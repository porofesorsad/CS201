package book;
//Yasmin Torres Module 3
public class DemoVolume 
{

	public static void main(String[] args) 
	{
	Book[] list	= new Book[3];
	list[0] = new Book("The Hitchhiker's guide to the Galaxy", "Douglas Adams", 208);
	list[1] = new Book("Restaurant at the End of the Universe", "Douglas Adams", 208);
	list[2] = new Book("Life, the Universe and Everything","Douglas Adams", 240);
	Volume volume1 = new Volume(list, 3, "Hitchhiker's Guide to the Galaxy");
	System.out.println(volume1);
	}

}
