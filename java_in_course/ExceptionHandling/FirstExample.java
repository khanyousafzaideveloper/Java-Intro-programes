import java.util.*;

public class FirstExample {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        try {
            s.nextInt();
            Thread.currentThread().sleep(1000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        catch(InputMismatchException e)
        {
            System.out.println("You did not print integer");
        }
        finally{
            System.out.println("This is Final");
        }   
    }
}
