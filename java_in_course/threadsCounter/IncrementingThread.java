public class IncrementingThread extends Thread{
    Counter c; 

    public IncrementingThread(Counter c)
    {
        this.c = c;
    }
    public void run()
    {
        c.increment();
    }
}
