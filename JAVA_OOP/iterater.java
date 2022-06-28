// Import the ArrayList class and the Iterator class
import java.util.ArrayList;
import java.util.Iterator;

public class iterater{
  public static void main(String[] args) {

    // Make a collection
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");

    // Get the iterator
    Iterator<String> it = cars.iterator();

    // Print the first item
    System.out.println(it.next());
   System.out.println(it.next());
    System.out.println(it.next());
    
    // To loop through a collection, use the hasNext() and next() methods of the Iterator:
    while(it.hasNext()) {
        System.out.println(it.next());
      }
  }
}