package student_details;

public class BsStudent extends Student{
	int semester;
    double cgpa;

    void set_semester(int s)
    {
        semester = s;
    }
    void set_cgpa(double c)
    {
        cgpa = c;
    }
    public int get_semester()
    {
        return semester;
    }
    double get_cgpa()
    {
        return cgpa;
    }
}
