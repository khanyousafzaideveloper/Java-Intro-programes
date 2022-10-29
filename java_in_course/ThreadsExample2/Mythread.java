public class Mythread extends Thread {
    public static void main(String[] args){
     
        Mythread t1 = new Mythread();
        Mythread t2 = new Mythread();
        Mythread t3 = new Mythread();
        t1.start();
        t2.start();
        t3.start();        

    }
    public void run() {
        System.out.println("Some code with a thread: " + getId());
    }
}
