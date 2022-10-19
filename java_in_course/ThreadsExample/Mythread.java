public class Mythread extends Thread {
    public void run(){
        try{ 
        Thread.sleep(0);
        System.out.println("Mythread");
        }
        catch(InterruptedException e)
        {
            System.out.println("Intrrupted");
        }
    }
}
