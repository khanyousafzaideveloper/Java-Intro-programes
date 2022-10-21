public class Sorting {

    public static void insertion_sort(int[] arr)
    {
        for(int j=1; j<arr.length; j++){
            int key = arr[j];
            int i = j - 1;
            while(i>=0 && arr[i] >  key){
                arr[i+1] = arr[i];
                i = i - 1;
            }
            arr[i+1] = key;
        }
        System.out.println("Sorted Array: ");
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
         int[] array0 = new int[20];
         for(int i=0; i<array0.length; i++){
            array0[i] = (int) (Math.random()*100);
         }
         System.out.println("Unsorted array: ");
         for(int i=0; i<array0.length; i++){
            System.out.println(array0[i]);
         }
         
         insertion_sort(array0);
    }
    
}
