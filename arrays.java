public class arrays {
    public static void main(String[] argv)
    {
        String[] cities = {"Peshawar", "Islamabad", "Lahore", "Karachi", "Quetta"};
        int[] mynum = {32,54,12,5,2,56};
        
        System.out.println(cities[3]);
        System.out.println(mynum[2]);


        // changing the array element 
        cities[1] = "Rawalpindi";
        System.out.println(cities[1]);

        // length of array

        System.out.println("Length of cities array is: " + cities.length);
        
        //length through an array

        for(int a=0; a < cities.length; a++)
        {
            System.out.println(cities[a]);
        }
        
        //for each loop

        for(int i : mynum)
        {
            System.out.println(i);
        }
        ////
        System.out.println("__________________________________________");
        
        int[][] some_numbers = { {10, 20, 30, 40}, {15, 25, 35} };
        for (int i = 0; i < some_numbers.length; ++i) {
            for(int j = 0; j < some_numbers[i].length; ++j) {
                System.out.println(some_numbers[i][j]);
            }
        }
    }
    
}
