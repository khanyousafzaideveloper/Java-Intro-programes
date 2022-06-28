import java.util.Scanner;
class scanner_multiple {
    public static void main(String[] args){ 

    Scanner myobj = new Scanner(System.in);

    System.out.println("Enter name, age, salary: ");
    
    //String input
    String name = myobj.nextLine();

    //Numerical input 
    int age = myobj.nextInt();
    double salary = myobj.nextDouble();

    //Output data given by user
    
    System.out.println("Your name is " + name + "and you are " + age + " years old and your salary is " + salary); 
}
}