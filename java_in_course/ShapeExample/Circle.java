
public class Circle extends Shape {
    private double radius;

    public Circle(double radius)
    {
        this.radius = radius;
    }
    public double get_area()
    {   
        return Math.PI*radius*radius;
    }
    public double get_parameter()
    {
        return 2*Math.PI*radius;
    }
    
}
