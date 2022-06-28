import java.util.LinkedList;

public class linked_list {
    public static void main(String[] args)
    {
        LinkedList<String> countries = new LinkedList<String>();
        countries.add("Pakistan");
        countries.add("India");
        countries.add("Bangladesh");
        countries.add("China");
        countries.add("Afghanistan");

        System.out.println(countries);

        System.out.println("*********Some methods in LinkedLists********");

        countries.addFirst("Iran");
        countries.addLast("Nepal");

        System.out.println(countries);

        System.out.println("First country in the list: " + countries.getFirst());
        System.out.println("Last country in the list: " + countries.getLast());
        

        
    }
    
}
