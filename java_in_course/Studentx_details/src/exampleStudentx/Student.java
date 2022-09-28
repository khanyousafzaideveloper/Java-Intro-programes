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
	public static void main(String[] args)
	{
		System.out.println(noOfStudents);
		Student s = new Student(12, "Jamal");
		s.get_info();
		System.out.println(noOfStudents);
		Student s2 = new Student(32, "Akram");
		s2.get_info();
		System.out.println(noOfStudents);
	}
}
