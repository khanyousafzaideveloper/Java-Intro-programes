class TestClass{
	public static void main(String[] args) {
		Counter c = new Counter();
		IncrementingThread inc1 = new IncrementingThread(c);
		DecrementingThread dec1 = new DecrementingThread(c, inc1);

		inc1.start();
		dec1.start();

	}
}

class DecrementingThread extends Thread {
	Counter c;
	Thread t;

	DecrementingThread(Counter c, Thread t) {
		this.c = c;
		this.t = t;
	}

	public void run() {
		System.out.println("Decrement Waiting for Increment to finish");
		try {
			t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		c.decrement();
	}
}
class IncrementingThread extends Thread {
	Counter c;

	IncrementingThread(Counter c) {
		this.c = c;
	}

	public void run() {
		c.increment();
		System.out.println("Increment Finished");
	}
}
class Counter {
	private int count = 0;

	public void increment() {
		for (int i = 0; i < 1000; i++) {
				count++;
		}
	}

	public void decrement() {
		for (int i = 0; i < 1000; i++) {
				count--;
		}
	}

	public void displayCount() {
		System.out.println(count);
	}
}
