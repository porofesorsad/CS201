package electronicEquip;

public class Driver 
{ 
	public static void main(String[] args)
	{
		Camera cam =  new Camera();
		System.out.println(cam);
		CellPhone cell = new CellPhone();
		System.out.println(cell);
		Computers pc = new Computers();
		System.out.println(pc);
	}
}
