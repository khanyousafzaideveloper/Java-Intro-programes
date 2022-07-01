import java.util.Scanner;

public class add_userinput {
    public static void main(String[] args) {
        int x, y, sum;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter a number: ");

        x =  s1.nextInt();

        System.out.println("Enter another number: ");
        y = s1.nextInt();

        sum = x + y; 
        System.out.println("The sum of " + x + " and " + y + " is " +   sum + ".");
    }
    
}
