public class MainClass {
    public static void main(String[] args) {
       Counter c = new Counter();
       IncrementingThread inc1 = new IncrementingThread(c);
       DecrementingThread inc2 = new DecrementingThread(c);
    
       inc1.start();
       try {
        inc1.join();
        inc2.start();
        inc2.join();
        } 
        catch (InterruptedException e) {
        e.printStackTrace();
        }
       c.displayCount();
    }
}
