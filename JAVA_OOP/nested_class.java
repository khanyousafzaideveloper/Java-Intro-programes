class outer_class
{
    int x = 5; 
    class inner_class{
        int y = 10;
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
