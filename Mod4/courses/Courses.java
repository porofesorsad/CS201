package courses;

public class Courses 
{
	private String title;
	private int courseNum = 0;
	private String info;
	private String depa;//Department
	
	public Courses(String t, int num, String in, String dpmt)
	{
		title = t;
		courseNum = num;
		info = in;
		depa = dpmt;
	}
	
	public String toString()
	{
		return "Class name: " + title + "\n" + "Class #:" + courseNum + "\n" + "Information: " + info + "\n" +
				"Department: " + depa + "\n";
	}
}
