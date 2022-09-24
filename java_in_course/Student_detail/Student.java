
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
		public static void main(String[] args)
		{
			Student s = new Student();
			s.set_name("Ajmal");
			s.get_name();
			
		}
}
