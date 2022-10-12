public class Square extends Shape{
    private double length;

    public Square(double l) throws Exception
    {   if(l<0)
        {
            throw new Exception();
        }
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
