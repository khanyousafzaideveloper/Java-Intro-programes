import java.io.File;
import java.io.IOException;

public class creating_file {
    public static void main(String[] args) {
        try{
            File myobj = new File("/home/ahmadyousafzai/Downloads/Prac_writing.txt");
            if(myobj.createNewFile()){
                System.out.println("File created : " + myobj.getName());
            }
            else{
                System.out.println("File already exist.");
            }
        }
            catch(IOException e){
                System.out.println("An error occured");
                e.printStackTrace();
            }

        
    }
    
}
