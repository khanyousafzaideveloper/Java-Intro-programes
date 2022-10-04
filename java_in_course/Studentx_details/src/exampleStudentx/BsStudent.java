package exampleStudentx;

public class BsStudent extends Student{
    
    private int semester;
    private double cgpa;
    BsStudent(int r, String n) {
        super(r, n);
        semester = 1;
    }
    public void promote()
    {
        semester++;
    }
    public int get_semster()
    {
        return semester;
    }
}
