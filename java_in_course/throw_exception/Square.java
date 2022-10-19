public class Square extends Shapes{

    double length;
    
    
    public Square(double length)
    {
        this.length = length;
    }
    public double get_area() {
        return length*length;
    }
    public double get_parameter() {
        return 4*length;
    }
}
