package exampleStudentx;

public class TestClass {
    public static void main(String[] args)
    {
        Student s = new Student(23, "Rohail");
        BsStudent b1 = new BsStudent(12, "Isam");
        Student s1 = new BsStudent(29, "Sajid");
        System.out.println("Semester: " + b1.get_semster());
        s.get_info();
        b1.get_info();
        s1.get_name();
    }
       
}
