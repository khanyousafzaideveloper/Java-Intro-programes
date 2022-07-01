import java.io.File;;

public class filehandling {
    public static void main(String[] args){ 

        File obj = new File("mytextfile.txt");

        System.out.println(obj.exists());
        System.out.println(obj.canRead());
        System.out.println(obj.canWrite());
        System.out.println(obj.getName());
        System.out.println(obj.length());
        System.out.println(obj.getAbsolutePath());
        System.out.println(obj.toPath());

    }   
}
