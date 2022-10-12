import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

public class Circle extends Shape {
    private double radius;

    public double get_area()
    {   
        return Math.PI*radius*radius;
    }
    public double get_parameter()
    {
        return 2*Math.PI*radius;
    }
    
}
