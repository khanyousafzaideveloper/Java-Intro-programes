public class Circlex extends Shapes {
    private double radius;

    public Circlex(double radius) throws Exception
    {   if(radius < 0)
        {
            throw new Exception();
        }
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
