class threads1 extends Thread {
    public void run()
    {
        System.out.println("This code is running a thread");
    }

    
    
public static void main(String args[]){  
    threads1 t1= new threads1();  
    t1.start();  
     }  
}

