import java.util.Calendar;
import java.util.Locale;
import static java.util.Calendar.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
public class Task1 {
    public static void main(String[] args)throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        String dateInString = "22-01-2005 10:20:56";
        Date date = sdf.parse(dateInString);
        Calendar a = getCalendar(date);
        Calendar b = getCalendar(new Date());
        int diff = b.get(YEAR) - a.get(YEAR);
        if (a.get(MONTH) > b.get(MONTH) ||
                (a.get(MONTH) == b.get(MONTH) && a.get(DATE) > b.get(DATE))) {
            diff--;
        }
        System.out.println(diff);
        if (diff>=18){
            System.out.println ("Here you go");
        }
        else {
            System.out.println ("Go home");
        }
    }

    public static Calendar getCalendar(Date date) {
        Calendar cal = Calendar.getInstance(Locale.US);
        cal.setTime(date);
        return cal;
    }}