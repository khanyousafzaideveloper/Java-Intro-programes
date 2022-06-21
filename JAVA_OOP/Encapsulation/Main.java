public class Main{
     
   public static void main(String[] argv){ 
        student s1 = new student();
        student s2 = new student();
       // obj1.name = "ALi";  // It will give error as it is private.
       // System.out.println(obj1.name);

        s1.setname("Ali");
        s2.setname("Furqan");

       System.out.println(s1.getname());
       System.out.println(s2.getname());
   }
}
