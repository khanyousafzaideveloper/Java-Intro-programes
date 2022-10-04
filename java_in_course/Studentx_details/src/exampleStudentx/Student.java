package exampleStudentx;

public class Student {
	private int roll;
	private String name;
	private static int noOfStudents;
	
	Student(int r, String n)
	{
		noOfStudents++;
		roll = r;
		name = n;
	}
	public void get_info()
	{
		System.out.println("Roll: " + roll);
		System.out.println("Name: " + name);
	}
	
	public void set_name(String n)
	{
		name = n;
	}
	public void set_roll(int r)
	{
		roll = r;
	}
	public String get_name()
	{
		return name;
	}
	public int get_roll()
	{
		return roll;
	}
}
