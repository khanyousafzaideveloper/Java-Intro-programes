public class Testclass {
    public static void main(String[] args)
    { 
        Mythread t = new Mythread();
        t.start();
        System.out.println("Main");
    }
    
}
