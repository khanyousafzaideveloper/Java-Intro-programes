import java.util.ArrayList;;

public class arraylist {
    public static void main(String[] args)
    {
        ArrayList<String>  cars = new ArrayList<String>();
        cars.add("Toyota");
        cars.add("Suzuki");
        cars.add("Porche");
        cars.add("Ford");

        System.out.println(cars);

         // accessing items
        System.out.println(cars.get(1));
        System.out.println(cars.get(0));

 System.out.println("****************************************************");

        //Changing an item in array
        cars.set(2, "ferrari");

        //Removing from array
        cars.remove(2);

        //size of array
        System.out.println(cars.size());
System.out.println("****************************************************");

        // loop through array list
        for(int i=0; i < cars.size(); i++)
        {
            System.out.println(cars.get(i));
        }

System.out.println("****************************************************");

        //for each loop
        for(String x : cars)
        System.out.println(x);

System.out.println("****************************************************");

        ArrayList<Integer> some_nums = new ArrayList<Integer>();
        some_nums.add(23);
        some_nums.add(5);
        some_nums.add(65);
        some_nums.add(27);
        some_nums.add(78);

        for(int w : some_nums)
        System.out.println(w);


}
      
}
