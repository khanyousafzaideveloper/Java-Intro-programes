import java.util.HashMap;;

public class hashmaps {
    public static void main(String[] args)
    {
        HashMap <String, String> Capitalcites = new HashMap<String, String>();

        Capitalcites.put("Pakistan", "Islamabad");
        Capitalcites.put("United States", "Washigton DC");
        Capitalcites.put("Iran", "Tehran");
        Capitalcites.put("China", "Beijing");
        Capitalcites.put("Afghanistan", "Kabul");
        Capitalcites.put("India", "New Delhi");

        System.out.println(Capitalcites);

        System.out.println(Capitalcites.get("Iran"));

        //Removing an item
        Capitalcites.remove("United States");

        //to remove all items
        Capitalcites.clear();

        System.out.print(Capitalcites);
    }
}
