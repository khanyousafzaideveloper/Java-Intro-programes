
public class Student {
		int roll;
		String name;
		
		void set_name(String n) {
			name = n;
		}
		void set_roll(int r) {
			roll = r;
		}
		String get_name()
		{
			return name;
		}
		int get_roll()
		{
			return roll;
		}
		public static void main()
		{
			Student s = new Student();
			s.set_name("Ajmal");
			s.get_name();
			
		}
}
