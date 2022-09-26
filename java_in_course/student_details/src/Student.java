package student_details;

public class Student {
	int roll;
	String name;
	
	void set_name(String n) {
		name = n;
	}
	void set_roll(int r) {
		roll = r;
	}
	public String get_name()
	{
		return name;
	}
	int get_roll()
	{
		return roll;
	}
}
