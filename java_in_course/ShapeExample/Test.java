public class Test {
    public static void main(String[] args)
    {   
        try{ 
        Circlex c1 = new Circlex(4);
        System.out.println(c1.get_area());
        System.out.println(c1.get_parameter());
        
        Square s1 = new Square(8);
        System.out.println(s1.get_area());
        System.out.println(s1.get_parameter());
        }
        catch(Exception e)
        {
            System.out.println("Enter a valid value....");
        }
    }
}