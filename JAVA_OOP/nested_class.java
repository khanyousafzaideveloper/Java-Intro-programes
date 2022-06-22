class outer_class
{
    int x = 5; 
    class inner_class{   // an inner class can also be private or protected
        int y = 10;      // An inner class can also be static, 
                        // which means that you can access it without creating an object of the outer class   
    }

}    
 public class nested_class {
    public static void main(String[] args)
    {
        outer_class obj1 = new outer_class();
        outer_class.inner_class obj2 = obj1.new inner_class();

        System.out.println(obj2.y + obj1.x);

    }


    
}
