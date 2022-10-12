public class Square extends Shape{

    private double length;

    public Square(double l)
    {
        length = l;
    }
    @Override
    public double get_area() {
        return length*length;
    }

    @Override
    public double get_parameter() {
        return length*4;
    }
    
}
