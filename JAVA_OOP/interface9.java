interface first_interface{
    public void myMethod(); // interface method
}

interface second_interface{ 
    public void myOtherMethod();    // interface method
    
}

class demoClass implements first_interface, second_interface {
    public void myMethod()
    {
        System.out.println("Hello world");
    }
    public void myOtherMethod()
    {
        System.out.println("I am learning JAVA");
    }
}
class interface9
{
    public static void main(String[] args)
    {
        demoClass obj1 = new demoClass();
        obj1.myMethod();
        obj1.myOtherMethod();
    }
}
