public class TestClassx{
    public static void main(String[] args)
    {   
        //for Outerclass
        MainClass m1 = new MainClass();
        System.out.println(m1.add(3,5));
        
        //for inner class
        MainClass.inner myinner = m1.new inner();
        System.out.println(myinner.multiply(2, 8));


        System.out.println(m1.add(2, 3) + myinner.multiply(2, 4));

        //for anonymous inner class
        MainClass anon  = new MainClass(){
            public void show()
            {
                System.out.println("This is anonymous inner Class");
            }
        }; 
        
        anon.show();
    }    
}
