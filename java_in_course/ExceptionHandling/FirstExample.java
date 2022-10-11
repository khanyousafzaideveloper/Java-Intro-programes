import java.util.InputMismatchException;
import java.util.Scanner;

public class FirstExample {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        try {
            s.nextInt();
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
