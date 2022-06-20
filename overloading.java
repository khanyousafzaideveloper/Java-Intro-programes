public class overloading {
    static int addnumbers(int x, int y)
    {
        return x+y;
    }
    static double addnumbers(double x, double y)
    {
        return x+y;
    }
    public static void main(String[] argv)
    {
        System.out.println(addnumbers(3, 5));
        System.out.println(addnumbers(34.21, 54.12));
    }
    
}
