import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;;

public class date_time{
    public static void main(String[] args)
    {
        // for displaying Date:
        LocalDate myobj = LocalDate.now();
        System.out.println("Todays date: " + myobj);

        //For displaying time
        LocalTime otherobj = LocalTime.now();
        System.out.println("Time: " + otherobj);

        // For displaying both, Date and time
        System.out.println("________________Date_and_time__________________________________");
        LocalDateTime obj1 = LocalDateTime.now();
        System.out.println(obj1);
        
        DateTimeFormatter myformat = DateTimeFormatter.ofPattern("dd-MM-yyyy    HH-mm-ss");
        String formated = obj1.format(myformat);
        System.out.println(formated);
        
    }
}