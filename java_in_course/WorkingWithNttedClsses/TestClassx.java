public class TestClassx{
    public static void main(String[] args)
    {
        MainClass m1 = new MainClass();
        System.out.println(m1.add(3,5));

        MainClass.inner myinner = m1.new inner();
        System.out.println(myinner.multiply(2, 8));
        
    }    
}
