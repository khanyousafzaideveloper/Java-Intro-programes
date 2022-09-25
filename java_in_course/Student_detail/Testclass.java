public class Testclass{
    public static void main(String[] args)
    {
        Student t1 = new Student();
        BSStudent b1 = new BSStudent();
        t1.set_name("Tom");
        t1.set_roll(23);
        b1.set_semester(3);
        System.out.println(t1.get_name());
        System.out.println(t1.get_roll());
        System.out.println(b1.get_semester());
        System.out.println(t1.get_name());
    }
    
}
