public class Testclass extends Student {
    public static void main(String[] args)
    {
        Testclass t1 = new Testclass();
        t1.set_name("Tom");
        t1.set_roll(23);
        t1.set_semester(3);
        System.out.println(t1.get_name());
        System.out.println(t1.get_roll());
        System.out.println(t1.get_semester());
        System.out.println(t1.get_name());
    }
    
}
