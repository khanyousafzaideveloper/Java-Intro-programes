public class Circlex extends Shapes{
    double radius;
    
    public Circlex(double radius)
    {
        this.radius = radius;
    }

    public void set_radius(double radius)
    {
        this.radius = radius;
    }
    public double get_radius(){
        return radius;
    }
    public double get_area()
    {
        return Math.PI*radius*radius;
    }
    public double get_perameter()
    {
        return 2*Math.PI *radius;
    }
}
