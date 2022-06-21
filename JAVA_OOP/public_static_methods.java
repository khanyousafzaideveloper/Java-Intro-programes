public class public_static_methods {
    static void mystaticMethod()
    {
        System.out.println("Static methods can be called without creating objects");
    }
    public void myPublicMethod()
    {
        System.out.println("Public methods musy be called by creating objects");
    }

    public static void main(String[] argv)
    {
        mystaticMethod();
        public_static_methods obj1 = new public_static_methods();
        obj1.myPublicMethod();
    }
    
}
