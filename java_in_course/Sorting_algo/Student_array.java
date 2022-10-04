public class Student_array {
    private String name;
    private int age;
    Student_array(String n, int a)
    {
        name = n;
        age = a;
    }
    public void get_info()
    {
        System.out.println("Name: " + name+",  Age: "+age );
    }
    public static void main(String[] args)
    {
        Student_array s1 = new Student_array("Amjad", 32);
        s1.get_info();
    }
}
