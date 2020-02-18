import javafx.util.converter.TimeStringConverter;

import java.security.Timestamp;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {

        long min = 603759600000L;
        long max = 1581980400000L;

            for (int i = 0; i < 14; i++) {
                Long timestamp = min + (long) (Math.random() * (max - min));
                Date date = new Date(timestamp);

                SimpleDateFormat DATE_FORMATER = new SimpleDateFormat("dd-MM-yyyy HH:mm");
                String datum = DATE_FORMATER.format(date);

                RezervaceJizdenka a = new RezervaceJizdenka;

                System.out.println(datum);
            }




        SimpleDateFormat DATE_FORMATER = new SimpleDateFormat("dd-MM-yyyy");

        String formatDatum = "18-02-2020";
        Calendar calendar = new GregorianCalendar(2020, 2, 18);
        Date date = null;
        {
            try {
                date = DATE_FORMATER.parse(formatDatum);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }




        List<Rezervace> rezervaces = new ArrayList<>();

        RezervaceJizdenka weebTour = new RezervaceJizdenka("15-03-2019","Erik Rusnák", "10-03-2020",typProstredku.AUTOBUS, "69", "3b", "14:15");
        rezervaces.add(weebTour);

        RezervaceJizdenka crusadeTour = new RezervaceJizdenka("28-10-2020", "Holy Crusader", "14-02-2020", typProstredku.OTHER, "22", "Jerusalem", "6:00");
        rezervaces.add(crusadeTour);

        RezervaceJizdenka terezinTour = new RezervaceJizdenka("12-08-2020", "Sherlock Gnomes", "06-08-2020", typProstredku.VLAK, "12c", "9 3/4", "11:00");
        rezervaces.add(terezinTour);


          //Date date1 = DATE_FORMATER.parse();

        RezervaceLetenka china = new RezervaceLetenka("08-08-2020", "Petr Lidumil", "10-02-2020", "22b58c45", "58b", "20-02-2020", 2);
        rezervaces.add(china);

        RezervaceLetenka WuChan = new RezervaceLetenka("05-03-2020", "Maho Jakotyč", "29-02-2020", "55c22v69n", "45a", "06-03-2020", 0);
        rezervaces.add(WuChan);

        System.out.println(weebTour.getDatum());


        for (Rezervace rezervace : rezervaces){
            rezervace.systemOutPrint();
        }
    }
}
