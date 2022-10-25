public class MainClass {
    public static void main(String[] args) {
       Counter c = new Counter();
       IncrementingThread inc = new IncrementingThread(c);
       
       inc.start();
       try {
        inc.join();
        } 
        catch (InterruptedException e) {
        e.printStackTrace();
        }
       c.displayCount();
    }
}
