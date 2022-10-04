public class insertion_sort {
    public static void main(String[] args)
    {
        int[] MyArray = new int[100];
        final int max = 100;
        for(int i=0; i<MyArray.length-1; i++)
        {
            MyArray[i] = (int)(Math.random()*max +1);
        }
        
        insertion_sorting(MyArray);
    }
    public static void insertion_sorting(int[] arr)
    {
       for(int i=0; i<arr.length-1; i++)
       {
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>key)
            {
                arr[j+1] = arr[j];
                j=j-1; 
            }
            arr[j+1] = key;
       }

       for(int i=0; i<arr.length-1; i++)
       {
            System.out.println(arr[i]);
       }
    }
}
