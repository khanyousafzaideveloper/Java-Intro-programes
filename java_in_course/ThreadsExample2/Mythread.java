public class Mythread extends Thread {
    public static void main(String[] args){
     
        Mythread t1 = new Mythread();
        t1.start();
    }
    public void run() {
        System.out.println("Some code with a thread");
    }
}
