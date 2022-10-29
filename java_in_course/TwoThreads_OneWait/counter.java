public class counter {
    public int count = 0;

    public void increment() {
        for (int i = 0; i < 10000; i++) {
            synchronized (this) {
                count++;
            }
        }
    }
    public void decrement() {
        for (int i = 0; i < 10000; i++) {
            synchronized (this) {
                count--;
            }
        }

    }
    public void display() {
        System.out.println("count : " + count);
    }

    public static class incrementingthread extends Thread {
        private counter c;

        public incrementingthread(counter c) {
            this.c = c;

        }

        public void run() {
            c.increment();
        }
}

public static class decrementingthread extends Thread {
    private counter c;
    private incrementingthread inc1;

    public decrementingthread(counter c ,incrementingthread inc1) {
        this.c = c;
        this.inc1=inc1;
    

    }

    public void run(){
        c.decrement();
        }   
    }

    public static void main(String[] args) throws Exception {
        counter c = new counter();
        incrementingthread inc1 = new incrementingthread(c);
        decrementingthread inc = new decrementingthread(c,inc1);

        inc1.start();
        inc.start();

        inc1.join();
        inc.join();
        c.display();

    }
}
