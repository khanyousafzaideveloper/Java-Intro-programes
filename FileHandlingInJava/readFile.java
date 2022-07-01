import java.io.FileReader;
import java.io.IOException;

public class readFile{
    public static void main(String[] args) {
        try{
            FileReader R1 = new FileReader("Prac_writing.txt");
            for(int i = R1.read(); i >= 0; i--)
            {
                System.out.print((char)i);
            }
            R1.close(); 
    }
    catch(IOException e)
    {
        System.out.println("An error occured");
        e.printStackTrace();
    }

}
}