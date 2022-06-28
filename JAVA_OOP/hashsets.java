import java.util.HashSet;

import javax.swing.plaf.synth.SynthLookAndFeel;
 
// A HashSet is a collection of items where every item is unique.
 
public class hashsets {
    public static void main(String[] args)
    {
        HashSet<String> cars = new HashSet<String>();
        cars.add("Toyota");
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Toyota");
        cars.add("Ford");

        System.out.println(cars);
        
        // To check whether an item exists in a HashSet, use the contains() method:

        System.out.println(cars.contains("Volvo"));

        //To remove an item, use the remove() method:

        cars.remove("BMW");

        //To remove all items, use the clear() method:

        System.out.println(cars.size());

        cars.clear();

        System.out.println(cars);

        System.out.println(cars.size());


    }
    
}
