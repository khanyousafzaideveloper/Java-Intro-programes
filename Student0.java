public class Student0{
    int roll;
    String name;
    
    Student0(int r, String n){
        roll = r;
        name = n;
    }
    Student0(){};
    void get_info()
    {
        System.out.println("Roll No: " + roll);
        System.out.println("Name: " + name);
    }
    void set_name(String n)
    {
        name = n;
    }
    void set_roll(int r)
    {
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
    public static void main(String[] args)
    {
        Student0 s1 = new Student0();
        Student0 s2 = new Student0();
        Student0 s3 = new Student0(23, "Qasim");
        s3.get_info();

        s1.set_name("Ajmal");
        s1.set_roll(23);
        s2.set_name("Wajid");
        s2.set_roll(87);

        System.out.println(s2.get_name());
        System.out.println(s2.get_roll());
    }
}

