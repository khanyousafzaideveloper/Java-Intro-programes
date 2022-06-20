public class methods {
  
    static void myMethod()
    {
        System.out.println("I am trying to learn Java methods.");
    }

    static void first_name(String fname)
    {
        System.out.println(fname + " " + "khan");
    }

    static void name_age(String name, int age)
    {
        System.out.println("Hi, my name is " + name + "and my age is " + age);
    }


    public static void main(String[] argv){ 
    
    myMethod();
    myMethod();
    myMethod();
    first_name("Yousaf");
    first_name("Ali");
    first_name("Ahmad");
    name_age("Hamza", 54);
    name_age("Asad", 32);

    }

    
}
