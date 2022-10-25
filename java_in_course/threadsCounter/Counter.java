public class Counter{
    private int count= 0;
    
    public void increment()
    {
        for(int i=0; i<100000; i++)
        {
            count++;
        }
    } 
    public void decrement()
    {
        for(int i=0; i<100000; i++)
        {
            count--;
        }
    }
    public void displayCount()
    {
        System.out.println(count);
    }
}