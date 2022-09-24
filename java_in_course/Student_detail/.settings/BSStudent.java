public class BSStudent extends Student{

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
    int get_semester()
    {
        return semester;
    }
    double get_cgpa()
    {
        return cgpa;
    }
    
}

