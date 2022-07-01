import java.io.File;;

public class deletefile {
    public static void main(String[] args) {
        
        File myobj = new File("anyfile.txt");
        myobj.delete();
    }
}
