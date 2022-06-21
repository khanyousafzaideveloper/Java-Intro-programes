public class static_modi {
    static void myStaticMethod(){
        System.out.println("static methods can be called without creating objects");
    }
    public void myPublicMethod(){
        System.out.println("Public methods can be called with creating objects  "); 
    }

    public static void main(String[] argv)
    {
        myStaticMethod(); // calling without creting object.
    
    static_modi obj1 = new static_modi(); 
    obj1.myPublicMethod();  // calling when object created.
}

}