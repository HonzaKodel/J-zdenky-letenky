import org.w3c.dom.ls.LSOutput;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Datum {

    SimpleDateFormat DATE_FORMATER = new SimpleDateFormat("dd-MM-yyyy HH:mm");

    String formatDatum = "18-02-2020 15:44";
    Calendar calendar = new GregorianCalendar(2020, 2, 18);
    Date date = null;

    {

        try {
            date = DATE_FORMATER.parse(formatDatum);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

}
