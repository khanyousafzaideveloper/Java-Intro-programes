public class Mythread extends Thread {
    
    public static void main(String[] args){
     
        Mythread t1 = new Mythread();
        Mythread t2 = new Mythread();
        Mythread t3 = new Mythread();

        t1.start();
        System.out.println(t1.getId());
        t1.setPriority(9);
        t2.start();
        t3.start();        

    }
    public void run() {
        for(int i = 0; i<10; i++){ 
            System.out.println(i+ ": Some code with a thread: " + currentThread().getName());
        }
    }
}
