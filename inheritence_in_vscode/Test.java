public class Test {
    public static void main(String[] args)
    {
        Animal a = new Animal(3, "mammal");
        Bird b =  new Bird(2, "Bird", "Crow", "black");
        a.get_info();  
        b.get_info();
    }
}
