package highSchoolLocker;
//Yasmin Torres Module 3
public class LockerDemo 
{
	public static void main(String[] args) 
	{
		boolean open = false;
		Locker a = new Locker(100, "Mickey Mouse", 3, new CombinationLock(28, 17, 39));	
		
		while(open != true)
		{
		if(a.openLocker())
			open = true;
		}
		
		a.putBookInLocker();
		a.putBookInLocker();
		a.putBookInLocker();
		System.out.println(a);
		System.out.println();
		Locker b = new Locker(275, "Donald Duck", 0, new CombinationLock(35, 16,27));
		b.removeBookFromLocker();
		System.out.println(b);
	}

}
