import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class writing_file {
    public static void main(String[] args) {

        try{
            FileWriter obj1 = new FileWriter("Prac_writing.txt"); 
            obj1.write("hello, Welcome to the world of programming.");
            obj1.close();
        }
        catch(IOException e){
            System.out.println("An error occured.");
            e.printStackTrace();
        }
    }       
}