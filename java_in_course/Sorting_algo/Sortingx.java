//package java_in_course.Sorting_algo;

public class Sortingx{
    public static void main(String[] args){ 
    int[] myArray  = new int[100];
    final int maxNum = 300;
               
    //initializing array
    for(int i=0; i<100; i++)
        {
            myArray[i] = (int)(Math.random()*maxNum);
        }    
    Sort(myArray);

    }
    public static void Sort(int[] arr)
    {
        for(int i=0; i<arr.length-1; i++)
        {
            for(int j=i; j>=0; j--)
            {
                if(arr[j+1]<arr[j])
                {
                    int temp = arr[j+1];
                        arr[j+1] = arr[j];
                        arr[j] = temp;
                }
            }
        }
        for(int x=0; x<100; x++)
        {
            System.out.println(arr[x]);
        }
    }
}
