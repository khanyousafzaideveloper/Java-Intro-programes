//package java_in_course.Sorting_algo;

public class Sortingx{
    public static void main(String[] args){ 
    int[] myArray  = new int[100];
    final int maxNum = 300;
               
    //initializing array
    for(int i=0; i<myArray.length-1; i++)
        {
            myArray[i] = (int)(Math.random()*(maxNum+1));
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
                else 
                    break;
            }
        }
        for(int i=0; i<arr.length-1; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
