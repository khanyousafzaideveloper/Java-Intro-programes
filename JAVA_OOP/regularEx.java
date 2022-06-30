import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class  regularEx{
    public static void main(String[] args)
    {
        Pattern pattern = Pattern.compile("world", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Welcome to the world of programming");

        boolean matchfound = matcher.find();
        if(matchfound)
        {
            System.out.println("Match found");
        }
        else{
            System.out.println("Match not found");
        }
    }
}
