package characterArray;
//Yasmin Torres Module 3
public class CharacterArray 
{

	public static void main(String[] args) 
	{
		StringBuilder input = new StringBuilder("NVCC Manassas Campus 6901 Sudley Road Manassas VA 20109");
		for (int i = 0; i < input.length(); i++) 
		{
		if(input.charAt(i) != ' ')
		  {	
			System.out.print("Character: " + input.charAt(i));
			if(Character.isDigit(input.charAt(i))) 
			{	
				System.out.print(" is a digit." + "\n");
				input.replace(i, i+1,"*");
			}	
			else if(Character.isUpperCase(input.charAt(i)))
			{	
				System.out.print(" is uppercase." + "\n");
				input.replace(i, i+1, input.substring(i, i+1).toLowerCase());
			}	
			else if(Character.isLowerCase(input.charAt(i)))
			{
				System.out.println(" is lowercase." + "\n");
				input.replace(i, i+1, input.substring(i, i+1).toUpperCase());
			}
			System.out.println(input);
		  }	
		}

	}

}
