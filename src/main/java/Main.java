import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args){

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

        List<Rezervace> rezervaces = new ArrayList<>();

        RezervaceJizdenka weebTour = new RezervaceJizdenka("15-03-2020","Erik Rusnák", "10-03-2020",typProstredku.AUTOBUS, "69", "3b", "14:15");
        rezervaces.add(weebTour);

        RezervaceJizdenka crusadeTour = new RezervaceJizdenka("28-10-2020", "Holy Crusader", "14-02-2020", typProstredku.OTHER, "22", "Jerusalem", "6:00");
        rezervaces.add(crusadeTour);

        RezervaceJizdenka terezinTour = new RezervaceJizdenka("12-08-2020", "Sherlock Gnomes", "06-08-2020", typProstredku.VLAK, "12c", "9 3/4", "11:00");
        rezervaces.add(terezinTour);



        RezervaceLetenka china = new RezervaceLetenka("08-08-2020", "Petr Lidumil", "10-02-2020", "22b58c45", "58b", "20-02-2020", 2);
        rezervaces.add(china);

        RezervaceLetenka WuChan = new RezervaceLetenka("05-03-2020", "Maho Jakotyč", "29-02-2020", "55c22v69n", "45a", "06-03-2020", 0);
        rezervaces.add(WuChan);



        for (Rezervace rezervace : rezervaces){
            rezervace.systemOutPrint();

        }
    }
}
