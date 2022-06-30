class runnable_interface_thread implements Runnable{
    public void run(){
        System.out.println("This code is running a thread");
    }
    public static void main(String[] args)
    {
        runnable_interface_thread t1 = new runnable_interface_thread();
        t1.run();
    }
} 